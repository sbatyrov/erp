package com.batyrov.erp.screen.reference.contract

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.reference.Contract

@UiController("erp_Contract.browse")
@UiDescriptor("contract-browse.xml")
@LookupComponent("contractsTable")
class ContractBrowse : StandardLookup<Contract>()