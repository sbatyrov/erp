package com.batyrov.erp.screen.docs.payment

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.docs.OutcomingCashPayment

@UiController("erp_OutcomingCashPayment.browse")
@UiDescriptor("outcoming-cash-payment-browse.xml")
@LookupComponent("outcomingCashPaymentsTable")
class OutcomingCashPaymentBrowse : StandardLookup<OutcomingCashPayment>()