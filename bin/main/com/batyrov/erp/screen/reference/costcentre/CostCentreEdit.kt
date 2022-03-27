package com.batyrov.erp.screen.reference.costcentre

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.reference.CostCentre

@UiController("erp_CostCentre.edit")
@UiDescriptor("cost-centre-edit.xml")
@EditedEntityContainer("costCentreDc")
class CostCentreEdit : StandardEditor<CostCentre>()