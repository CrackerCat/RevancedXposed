package io.github.chsbuffer.revancedxposed

@Suppress("unused")
enum class Opcode(val opName: String) {
    NOP("nop"),
    MOVE("move"),
    MOVE_FROM16("move/from16"),
    MOVE_16("move/16"),
    MOVE_WIDE("move-wide"),
    MOVE_WIDE_FROM16("move-wide/from16"),
    MOVE_WIDE_16("move-wide/16"),
    MOVE_OBJECT("move-object"),
    MOVE_OBJECT_FROM16("move-object/from16"),
    MOVE_OBJECT_16("move-object/16"),
    MOVE_RESULT("move-result"),
    MOVE_RESULT_WIDE("move-result-wide"),
    MOVE_RESULT_OBJECT("move-result-object"),
    MOVE_EXCEPTION("move-exception"),
    RETURN_VOID("return-void"),
    RETURN("return"),
    RETURN_WIDE("return-wide"),
    RETURN_OBJECT("return-object"),
    CONST_4("const/4"),
    CONST_16("const/16"),
    CONST("const"),
    CONST_HIGH16("const/high16"),
    CONST_WIDE_16("const-wide/16"),
    CONST_WIDE_32("const-wide/32"),
    CONST_WIDE("const-wide"),
    CONST_WIDE_HIGH16("const-wide/high16"),
    CONST_STRING("const-string"),
    CONST_STRING_JUMBO("const-string/jumbo"),
    CONST_CLASS("const-class"),
    MONITOR_ENTER("monitor-enter"),
    MONITOR_EXIT("monitor-exit"),
    CHECK_CAST("check-cast"),
    INSTANCE_OF("instance-of"),
    ARRAY_LENGTH("array-length"),
    NEW_INSTANCE("new-instance"),
    NEW_ARRAY("new-array"),
    FILLED_NEW_ARRAY("filled-new-array"),
    FILLED_NEW_ARRAY_RANGE("filled-new-array/range"),
    FILL_ARRAY_DATA("fill-array-data"),
    THROW("throw"),
    GOTO("goto"),
    GOTO_16("goto/16"),
    GOTO_32("goto/32"),
    PACKED_SWITCH("packed-switch"),
    SPARSE_SWITCH("sparse-switch"),
    CMPL_FLOAT("cmpl-float"),
    CMPG_FLOAT("cmpg-float"),
    CMPL_DOUBLE("cmpl-double"),
    CMPG_DOUBLE("cmpg-double"),
    CMP_LONG("cmp-long"),
    IF_EQ("if-eq"),
    IF_NE("if-ne"),
    IF_LT("if-lt"),
    IF_GE("if-ge"),
    IF_GT("if-gt"),
    IF_LE("if-le"),
    IF_EQZ("if-eqz"),
    IF_NEZ("if-nez"),
    IF_LTZ("if-ltz"),
    IF_GEZ("if-gez"),
    IF_GTZ("if-gtz"),
    IF_LEZ("if-lez"),
    UNUSED_3E("unused-3e"),
    UNUSED_3F("unused-3f"),
    UNUSED_40("unused-40"),
    UNUSED_41("unused-41"),
    UNUSED_42("unused-42"),
    UNUSED_43("unused-43"),
    AGET("aget"),
    AGET_WIDE("aget-wide"),
    AGET_OBJECT("aget-object"),
    AGET_BOOLEAN("aget-boolean"),
    AGET_BYTE("aget-byte"),
    AGET_CHAR("aget-char"),
    AGET_SHORT("aget-short"),
    APUT("aput"),
    APUT_WIDE("aput-wide"),
    APUT_OBJECT("aput-object"),
    APUT_BOOLEAN("aput-boolean"),
    APUT_BYTE("aput-byte"),
    APUT_CHAR("aput-char"),
    APUT_SHORT("aput-short"),
    IGET("iget"),
    IGET_WIDE("iget-wide"),
    IGET_OBJECT("iget-object"),
    IGET_BOOLEAN("iget-boolean"),
    IGET_BYTE("iget-byte"),
    IGET_CHAR("iget-char"),
    IGET_SHORT("iget-short"),
    IPUT("iput"),
    IPUT_WIDE("iput-wide"),
    IPUT_OBJECT("iput-object"),
    IPUT_BOOLEAN("iput-boolean"),
    IPUT_BYTE("iput-byte"),
    IPUT_CHAR("iput-char"),
    IPUT_SHORT("iput-short"),
    SGET("sget"),
    SGET_WIDE("sget-wide"),
    SGET_OBJECT("sget-object"),
    SGET_BOOLEAN("sget-boolean"),
    SGET_BYTE("sget-byte"),
    SGET_CHAR("sget-char"),
    SGET_SHORT("sget-short"),
    SPUT("sput"),
    SPUT_WIDE("sput-wide"),
    SPUT_OBJECT("sput-object"),
    SPUT_BOOLEAN("sput-boolean"),
    SPUT_BYTE("sput-byte"),
    SPUT_CHAR("sput-char"),
    SPUT_SHORT("sput-short"),
    INVOKE_VIRTUAL("invoke-virtual"),
    INVOKE_SUPER("invoke-super"),
    INVOKE_DIRECT("invoke-direct"),
    INVOKE_STATIC("invoke-static"),
    INVOKE_INTERFACE("invoke-interface"),
    RETURN_VOID_NO_BARRIER("return-void-no-barrier"),
    INVOKE_VIRTUAL_RANGE("invoke-virtual/range"),
    INVOKE_SUPER_RANGE("invoke-super/range"),
    INVOKE_DIRECT_RANGE("invoke-direct/range"),
    INVOKE_STATIC_RANGE("invoke-static/range"),
    INVOKE_INTERFACE_RANGE("invoke-interface/range"),
    UNUSED_79("unused-79"),
    UNUSED_7A("unused-7a"),
    NEG_INT("neg-int"),
    NOT_INT("not-int"),
    NEG_LONG("neg-long"),
    NOT_LONG("not-long"),
    NEG_FLOAT("neg-float"),
    NEG_DOUBLE("neg-double"),
    INT_TO_LONG("int-to-long"),
    INT_TO_FLOAT("int-to-float"),
    INT_TO_DOUBLE("int-to-double"),
    LONG_TO_INT("long-to-int"),
    LONG_TO_FLOAT("long-to-float"),
    LONG_TO_DOUBLE("long-to-double"),
    FLOAT_TO_INT("float-to-int"),
    FLOAT_TO_LONG("float-to-long"),
    FLOAT_TO_DOUBLE("float-to-double"),
    DOUBLE_TO_INT("double-to-int"),
    DOUBLE_TO_LONG("double-to-long"),
    DOUBLE_TO_FLOAT("double-to-float"),
    INT_TO_BYTE("int-to-byte"),
    INT_TO_CHAR("int-to-char"),
    INT_TO_SHORT("int-to-short"),
    ADD_INT("add-int"),
    SUB_INT("sub-int"),
    MUL_INT("mul-int"),
    DIV_INT("div-int"),
    REM_INT("rem-int"),
    AND_INT("and-int"),
    OR_INT("or-int"),
    XOR_INT("xor-int"),
    SHL_INT("shl-int"),
    SHR_INT("shr-int"),
    USHR_INT("ushr-int"),
    ADD_LONG("add-long"),
    SUB_LONG("sub-long"),
    MUL_LONG("mul-long"),
    DIV_LONG("div-long"),
    REM_LONG("rem-long"),
    AND_LONG("and-long"),
    OR_LONG("or-long"),
    XOR_LONG("xor-long"),
    SHL_LONG("shl-long"),
    SHR_LONG("shr-long"),
    USHR_LONG("ushr-long"),
    ADD_FLOAT("add-float"),
    SUB_FLOAT("sub-float"),
    MUL_FLOAT("mul-float"),
    DIV_FLOAT("div-float"),
    REM_FLOAT("rem-float"),
    ADD_DOUBLE("add-double"),
    SUB_DOUBLE("sub-double"),
    MUL_DOUBLE("mul-double"),
    DIV_DOUBLE("div-double"),
    REM_DOUBLE("rem-double"),
    ADD_INT_2ADDR("add-int/2addr"),
    SUB_INT_2ADDR("sub-int/2addr"),
    MUL_INT_2ADDR("mul-int/2addr"),
    DIV_INT_2ADDR("div-int/2addr"),
    REM_INT_2ADDR("rem-int/2addr"),
    AND_INT_2ADDR("and-int/2addr"),
    OR_INT_2ADDR("or-int/2addr"),
    XOR_INT_2ADDR("xor-int/2addr"),
    SHL_INT_2ADDR("shl-int/2addr"),
    SHR_INT_2ADDR("shr-int/2addr"),
    USHR_INT_2ADDR("ushr-int/2addr"),
    ADD_LONG_2ADDR("add-long/2addr"),
    SUB_LONG_2ADDR("sub-long/2addr"),
    MUL_LONG_2ADDR("mul-long/2addr"),
    DIV_LONG_2ADDR("div-long/2addr"),
    REM_LONG_2ADDR("rem-long/2addr"),
    AND_LONG_2ADDR("and-long/2addr"),
    OR_LONG_2ADDR("or-long/2addr"),
    XOR_LONG_2ADDR("xor-long/2addr"),
    SHL_LONG_2ADDR("shl-long/2addr"),
    SHR_LONG_2ADDR("shr-long/2addr"),
    USHR_LONG_2ADDR("ushr-long/2addr"),
    ADD_FLOAT_2ADDR("add-float/2addr"),
    SUB_FLOAT_2ADDR("sub-float/2addr"),
    MUL_FLOAT_2ADDR("mul-float/2addr"),
    DIV_FLOAT_2ADDR("div-float/2addr"),
    REM_FLOAT_2ADDR("rem-float/2addr"),
    ADD_DOUBLE_2ADDR("add-double/2addr"),
    SUB_DOUBLE_2ADDR("sub-double/2addr"),
    MUL_DOUBLE_2ADDR("mul-double/2addr"),
    DIV_DOUBLE_2ADDR("div-double/2addr"),
    REM_DOUBLE_2ADDR("rem-double/2addr"),
    ADD_INT_LIT16("add-int/lit16"),
    RSUB_INT("rsub-int"),
    MUL_INT_LIT16("mul-int/lit16"),
    DIV_INT_LIT16("div-int/lit16"),
    REM_INT_LIT16("rem-int/lit16"),
    AND_INT_LIT16("and-int/lit16"),
    OR_INT_LIT16("or-int/lit16"),
    XOR_INT_LIT16("xor-int/lit16"),
    ADD_INT_LIT8("add-int/lit8"),
    RSUB_INT_LIT8("rsub-int/lit8"),
    MUL_INT_LIT8("mul-int/lit8"),
    DIV_INT_LIT8("div-int/lit8"),
    REM_INT_LIT8("rem-int/lit8"),
    AND_INT_LIT8("and-int/lit8"),
    OR_INT_LIT8("or-int/lit8"),
    XOR_INT_LIT8("xor-int/lit8"),
    SHL_INT_LIT8("shl-int/lit8"),
    SHR_INT_LIT8("shr-int/lit8"),
    USHR_INT_LIT8("ushr-int/lit8"),
    IGET_QUICK("iget-quick"),
    IGET_WIDE_QUICK("iget-wide-quick"),
    IGET_OBJECT_QUICK("iget-object-quick"),
    IPUT_QUICK("iput-quick"),
    IPUT_WIDE_QUICK("iput-wide-quick"),
    IPUT_OBJECT_QUICK("iput-object-quick"),
    INVOKE_VIRTUAL_QUICK("invoke-virtual-quick"),
    INVOKE_VIRTUAL_RANGE_QUICK("invoke-virtual/range-quick"),
    IPUT_BOOLEAN_QUICK("iput-boolean-quick"),
    IPUT_BYTE_QUICK("iput-byte-quick"),
    IPUT_CHAR_QUICK("iput-char-quick"),
    IPUT_SHORT_QUICK("iput-short-quick"),
    IGET_BOOLEAN_QUICK("iget-boolean-quick"),
    IGET_BYTE_QUICK("iget-byte-quick"),
    IGET_CHAR_QUICK("iget-char-quick"),
    IGET_SHORT_QUICK("iget-short-quick"),
    UNUSED_F3("unused-f3"),
    UNUSED_F4("unused-f4"),
    UNUSED_F5("unused-f5"),
    UNUSED_F6("unused-f6"),
    UNUSED_F7("unused-f7"),
    UNUSED_F8("unused-f8"),
    UNUSED_F9("unused-f9"),
    INVOKE_POLYMORPHIC("invoke-polymorphic"),
    INVOKE_POLYMORPHIC_RANGE("invoke-polymorphic/range"),
    INVOKE_CUSTOM("invoke-custom"),
    INVOKE_CUSTOM_RANGE("invoke-custom/range"),
    CONST_METHOD_HANDLE("const-method-handle"),
    CONST_METHOD_TYPE("const-method-type");

    val opCode: Int = ordinal
}