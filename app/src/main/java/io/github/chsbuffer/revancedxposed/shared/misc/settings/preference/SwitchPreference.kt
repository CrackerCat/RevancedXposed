@file:Suppress("DEPRECATION", "DiscouragedApi")

package io.github.chsbuffer.revancedxposed.shared.misc.settings.preference

import android.content.Context
import android.preference.Preference
import android.preference.PreferenceManager
import android.preference.SwitchPreference

@Suppress("MemberVisibilityCanBePrivate")
class SwitchPreference(
    key: String? = null,
    titleKey: String = "${key}_title",
    tag: String = "SwitchPreference",
    icon: String? = null,
    layout: String? = null,
    val summaryOnKey: String = "${key}_summary_on",
    val summaryOffKey: String = "${key}_summary_off"
) : BasePreference(key, titleKey, null, icon, layout, tag) {
    override fun build(ctx: Context, prefMgr: PreferenceManager): Preference {
        return SwitchPreference(ctx).apply {
            applyBaseAttrs(this)
            trySetString(summaryOnKey) { summaryOn = it }
            trySetString(summaryOffKey) { summaryOff = it }
        }
    }
}