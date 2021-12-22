package com.batyrov.erp.screen.reference.costcentre

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.reference.CostCentre

@UiController("erp_CostCentre.browse")
@UiDescriptor("cost-centre-browse.xml")
@LookupComponent("costCentresTable")
class CostCentreBrowse : StandardLookup<CostCentre>()