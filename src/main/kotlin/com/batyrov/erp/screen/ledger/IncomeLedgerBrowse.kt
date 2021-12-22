package com.batyrov.erp.screen.ledger

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.ledger.IncomeLedger

@UiController("erp_IncomeLedger.browse")
@UiDescriptor("income-ledger-browse.xml")
@LookupComponent("incomeLedgersTable")
class IncomeLedgerBrowse : StandardLookup<IncomeLedger>()