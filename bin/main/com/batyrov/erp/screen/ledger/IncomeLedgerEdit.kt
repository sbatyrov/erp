package com.batyrov.erp.screen.ledger

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.ledger.IncomeLedger

@UiController("erp_IncomeLedger.edit")
@UiDescriptor("income-ledger-edit.xml")
@EditedEntityContainer("incomeLedgerDc")
class IncomeLedgerEdit : StandardEditor<IncomeLedger>()