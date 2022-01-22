package com.batyrov.erp.screen.reference.ware

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.reference.Ware

@UiController("erp_Ware.browse")
@UiDescriptor("ware-browse.xml")
@LookupComponent("waresTable")
class WareBrowse : StandardLookup<Ware>()