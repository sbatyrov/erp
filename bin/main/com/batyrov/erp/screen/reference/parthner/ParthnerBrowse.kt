package com.batyrov.erp.screen.reference.parthner

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.reference.Parthner

@UiController("erp_Parthner.browse")
@UiDescriptor("parthner-browse.xml")
@LookupComponent("parthnersTable")
class ParthnerBrowse : StandardLookup<Parthner>()