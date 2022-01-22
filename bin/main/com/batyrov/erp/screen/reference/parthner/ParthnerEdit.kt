package com.batyrov.erp.screen.reference.parthner

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.reference.Parthner

@UiController("erp_Parthner.edit")
@UiDescriptor("parthner-edit.xml")
@EditedEntityContainer("parthnerDc")
class ParthnerEdit : StandardEditor<Parthner>()