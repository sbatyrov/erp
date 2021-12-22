package com.batyrov.erp.screen.docs.payment

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.docs.IncomingCashPayment

@UiController("erp_IncomingCashPayment.browse")
@UiDescriptor("incoming-cash-payment-browse.xml")
@LookupComponent("incomingCashPaymentsTable")
class IncomingCashPaymentBrowse : StandardLookup<IncomingCashPayment>()