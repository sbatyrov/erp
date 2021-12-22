package com.batyrov.erp.screen.docs.requestforpurchase

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.docs.RequestForPurchase

@UiController("erp_RequestForPurchase.browse")
@UiDescriptor("request-for-purchase-browse.xml")
@LookupComponent("requestForPurchasesTable")
class RequestForPurchaseBrowse : StandardLookup<RequestForPurchase>()