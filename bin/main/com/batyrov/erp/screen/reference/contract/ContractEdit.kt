package com.batyrov.erp.screen.reference.contract

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.reference.Contract

@UiController("erp_Contract.edit")
@UiDescriptor("contract-edit.xml")
@EditedEntityContainer("contractDc")
class ContractEdit : StandardEditor<Contract>()