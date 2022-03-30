package com.batyrov.erp.screen.qna.reference

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.qna.Reference

@UiController("erp_Reference.edit")
@UiDescriptor("reference-edit.xml")
@EditedEntityContainer("referenceDc")
class ReferenceEdit : StandardEditor<Reference>()