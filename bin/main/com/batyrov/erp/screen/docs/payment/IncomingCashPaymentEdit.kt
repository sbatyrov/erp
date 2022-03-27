package com.batyrov.erp.screen.docs.payment

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.docs.IncomingCashPayment

@UiController("erp_IncomingCashPayment.edit")
@UiDescriptor("incoming-cash-payment-edit.xml")
@EditedEntityContainer("incomingCashPaymentDc")
class IncomingCashPaymentEdit : StandardEditor<IncomingCashPayment>()