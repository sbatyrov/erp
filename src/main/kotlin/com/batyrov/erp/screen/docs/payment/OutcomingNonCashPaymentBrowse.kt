package com.batyrov.erp.screen.docs.payment

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.docs.OutcomingNonCashPayment

@UiController("erp_OutcomingNonCashPayment.browse")
@UiDescriptor("outcoming-non-cash-payment-browse.xml")
@LookupComponent("outcomingNonCashPaymentsTable")
class OutcomingNonCashPaymentBrowse : StandardLookup<OutcomingNonCashPayment>()