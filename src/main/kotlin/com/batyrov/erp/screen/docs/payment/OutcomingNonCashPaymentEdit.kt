package com.batyrov.erp.screen.docs.payment

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.docs.OutcomingNonCashPayment

@UiController("erp_OutcomingNonCashPayment.edit")
@UiDescriptor("outcoming-non-cash-payment-edit.xml")
@EditedEntityContainer("outcomingNonCashPaymentDc")
class OutcomingNonCashPaymentEdit : StandardEditor<OutcomingNonCashPayment>()