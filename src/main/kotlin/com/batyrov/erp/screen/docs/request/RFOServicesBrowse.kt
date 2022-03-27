package com.batyrov.erp.screen.docs.request

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.docs.RFOServices

@UiController("erp_RFOServices.browse")
@UiDescriptor("rfo-services-browse.xml")
@LookupComponent("rFOServicesesTable")
class RFOServicesBrowse : StandardLookup<RFOServices>()