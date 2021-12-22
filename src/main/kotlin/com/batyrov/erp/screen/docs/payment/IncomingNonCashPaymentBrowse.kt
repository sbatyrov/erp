package com.batyrov.erp.screen.docs.payment

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.docs.IncomingNonCashPayment

@UiController("erp_IncomingNonCashPayment.browse")
@UiDescriptor("incoming-non-cash-payment-browse.xml")
@LookupComponent("incomingNonCashPaymentsTable")
class IncomingNonCashPaymentBrowse : StandardLookup<IncomingNonCashPayment>()