package com.batyrov.erp.screen.docs.request

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.docs.RFOWares2

@UiController("erp_RequestForPurchaseDetail.edit")
@UiDescriptor("request-for-purchase-detail-edit.xml")
@EditedEntityContainer("requestForPurchaseDetailDc")
class RequestForPurchaseDetailEdit : StandardEditor<RFOWares2>()