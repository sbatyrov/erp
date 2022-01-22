package com.batyrov.erp.screen.docs.payment

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.docs.OutcomingCashPayment

@UiController("erp_OutcomingCashPayment.edit")
@UiDescriptor("outcoming-cash-payment-edit.xml")
@EditedEntityContainer("outcomingCashPaymentDc")
class OutcomingCashPaymentEdit : StandardEditor<OutcomingCashPayment>() {
    @Subscribe
    private fun onBeforeCommitChanges(event: BeforeCommitChangesEvent) {

    }}