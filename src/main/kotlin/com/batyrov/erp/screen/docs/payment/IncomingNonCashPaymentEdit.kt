package com.batyrov.erp.screen.docs.payment

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.docs.IncomingNonCashPayment

@UiController("erp_IncomingNonCashPayment.edit")
@UiDescriptor("incoming-non-cash-payment-edit.xml")
@EditedEntityContainer("incomingNonCashPaymentDc")
class IncomingNonCashPaymentEdit : StandardEditor<IncomingNonCashPayment>()