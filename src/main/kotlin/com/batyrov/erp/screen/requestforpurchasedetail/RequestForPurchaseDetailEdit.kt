package com.batyrov.erp.screen.requestforpurchasedetail

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.docs.RequestForPurchaseDetail

@UiController("erp_RequestForPurchaseDetail.edit")
@UiDescriptor("request-for-purchase-detail-edit.xml")
@EditedEntityContainer("requestForPurchaseDetailDc")
class RequestForPurchaseDetailEdit : StandardEditor<RequestForPurchaseDetail>()