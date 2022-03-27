package com.batyrov.erp.screen.docs.request

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.docs.RFOWares

@UiController("erp_RFOWares.edit")
@UiDescriptor("rfo-wares-edit.xml")
@EditedEntityContainer("rFOWaresDc")
class RFOWaresEdit : StandardEditor<RFOWares>()