package com.batyrov.erp.screen.qna.geopoint

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.qna.GeoPoint

@UiController("erp_GeoPoint.edit")
@UiDescriptor("geo-point-edit.xml")
@EditedEntityContainer("geoPointDc")
class GeoPointEdit : StandardEditor<GeoPoint>()