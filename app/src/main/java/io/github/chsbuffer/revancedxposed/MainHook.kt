package io.github.chsbuffer.revancedxposed

import android.app.Application
import app.revanced.extension.shared.Logger
import de.robv.android.xposed.IXposedHookInitPackageResources
import de.robv.android.xposed.IXposedHookLoadPackage
import de.robv.android.xposed.IXposedHookZygoteInit
import de.robv.android.xposed.IXposedHookZygoteInit.StartupParam
import de.robv.android.xposed.XC_MethodHook
import de.robv.android.xposed.XposedBridge
import de.robv.android.xposed.XposedHelpers
import de.robv.android.xposed.callbacks.XC_InitPackageResources.InitPackageResourcesParam
import de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam
import io.github.chsbuffer.revancedxposed.common.UpdateChecker
import io.github.chsbuffer.revancedxposed.music.MusicHook
import io.github.chsbuffer.revancedxposed.spotify.SpotifyHook
import io.github.chsbuffer.revancedxposed.youtube.YoutubeHook
import kotlin.system.measureTimeMillis

class MainHook : IXposedHookLoadPackage, IXposedHookInitPackageResources, IXposedHookZygoteInit {
    lateinit var startupParam: StartupParam
    lateinit var resparam: InitPackageResourcesParam
    lateinit var lpparam: LoadPackageParam
    lateinit var app: Application
    var targetPackageName: String? = null
    val hooksByPackage = mapOf(
        "com.google.android.apps.youtube.music" to { MusicHook(app, lpparam) },
        "com.google.android.youtube" to { YoutubeHook(app, lpparam, resparam, startupParam) },
        "com.spotify.music" to { SpotifyHook(app, lpparam) },
    )

    fun shouldHook(packageName: String): Boolean {
        if (!hooksByPackage.containsKey(packageName)) return false
        if (targetPackageName == null) targetPackageName = packageName
        return targetPackageName == packageName
    }

    override fun handleLoadPackage(lpparam: LoadPackageParam) {
        if (!lpparam.isFirstApplication) return
        if (!shouldHook(lpparam.packageName)) return
        this.lpparam = lpparam

        inContext(lpparam) { app ->
            val t = measureTimeMillis {
                this.app = app
                hooksByPackage[lpparam.packageName]?.invoke()?.Hook()
            }
            Logger.printDebug { "$targetPackageName handleLoadPackage: ${t}ms" }
        }
    }

    override fun handleInitPackageResources(resparam: InitPackageResourcesParam) {
        if (!shouldHook(resparam.packageName)) return
        this.resparam = resparam
    }

    override fun initZygote(startupParam: StartupParam) {
        this.startupParam = startupParam
    }
}

fun inContext(lpparam: LoadPackageParam, f: (Application) -> Unit) {
    val appClazz = XposedHelpers.findClass(lpparam.appInfo.className, lpparam.classLoader)
    XposedBridge.hookMethod(appClazz.getMethod("onCreate"), object : XC_MethodHook() {
        override fun afterHookedMethod(param: MethodHookParam) {
            val app = param.thisObject as Application
            f(app)
            UpdateChecker(app).apply {
                hookNewActivity()
                autoCheckUpdate()
            }
        }
    })
}
