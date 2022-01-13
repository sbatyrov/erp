package com.batyrov.erp.screen.docs.request

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.docs.RFOWares

@UiController("erp_RFOWares.browse")
@UiDescriptor("rfo-wares-browse.xml")
@LookupComponent("rFOWaresesTable")
class RFOWaresBrowse : StandardLookup<RFOWares>()