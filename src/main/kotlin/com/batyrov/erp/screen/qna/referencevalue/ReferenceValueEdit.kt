package com.batyrov.erp.screen.qna.referencevalue

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.qna.ReferenceValue

@UiController("erp_ReferenceValue.edit")
@UiDescriptor("reference-value-edit.xml")
@EditedEntityContainer("referenceValueDc")
class ReferenceValueEdit : StandardEditor<ReferenceValue>()