package com.batyrov.erp.screen.reference.contract

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.reference.ContractOrder

@UiController("erp_ContractOrder.edit")
@UiDescriptor("contract-order-edit.xml")
@EditedEntityContainer("contractOrderDc")
class ContractOrderEdit : StandardEditor<ContractOrder>()