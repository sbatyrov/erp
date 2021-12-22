package com.batyrov.erp.screen.ledger

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.ledger.ParthnerLedger

@UiController("erp_ParthnerLedger.browse")
@UiDescriptor("parthner-ledger-browse.xml")
@LookupComponent("parthnerLedgersTable")
class ParthnerLedgerBrowse : StandardLookup<ParthnerLedger>()