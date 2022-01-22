package com.batyrov.erp.screen.docs.request

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.docs.RFOServices

@UiController("erp_RFOServices.edit")
@UiDescriptor("rfo-services-edit.xml")
@EditedEntityContainer("rFOServicesDc")
class RFOServicesEdit : StandardEditor<RFOServices>()