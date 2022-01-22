package com.batyrov.erp.screen.ledger

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.ledger.ExpensesLedger

@UiController("erp_ExpensesLedger.browse")
@UiDescriptor("expenses-ledger-browse.xml")
@LookupComponent("expensesLedgersTable")
class ExpensesLedgerBrowse : StandardLookup<ExpensesLedger>()