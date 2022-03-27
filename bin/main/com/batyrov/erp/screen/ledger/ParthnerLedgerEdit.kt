package com.batyrov.erp.screen.ledger

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.ledger.ParthnerLedger

@UiController("erp_ParthnerLedger.edit")
@UiDescriptor("parthner-ledger-edit.xml")
@EditedEntityContainer("parthnerLedgerDc")
class ParthnerLedgerEdit : StandardEditor<ParthnerLedger>()