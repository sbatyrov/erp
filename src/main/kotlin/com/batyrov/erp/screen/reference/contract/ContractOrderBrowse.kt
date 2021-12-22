package com.batyrov.erp.screen.reference.contract

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.reference.ContractOrder

@UiController("erp_ContractOrder.browse")
@UiDescriptor("contract-order-browse.xml")
@LookupComponent("contractOrdersTable")
class ContractOrderBrowse : StandardLookup<ContractOrder>()