package com.batyrov.erp.screen.ledger

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.ledger.ExpensesLedger

@UiController("erp_ExpensesLedger.edit")
@UiDescriptor("expenses-ledger-edit.xml")
@EditedEntityContainer("expensesLedgerDc")
class ExpensesLedgerEdit : StandardEditor<ExpensesLedger>()