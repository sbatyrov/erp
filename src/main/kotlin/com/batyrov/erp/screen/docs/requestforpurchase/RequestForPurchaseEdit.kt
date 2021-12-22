package com.batyrov.erp.screen.docs.requestforpurchase

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.docs.RequestForPurchase

@UiController("erp_RequestForPurchase.edit")
@UiDescriptor("request-for-purchase-edit.xml")
@EditedEntityContainer("requestForPurchaseDc")
class RequestForPurchaseEdit : StandardEditor<RequestForPurchase>()