package com.batyrov.erp.screen.qna.geopoint

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.qna.GeoPoint

@UiController("erp_GeoPoint.browse")
@UiDescriptor("geo-point-browse.xml")
@LookupComponent("geoPointsTable")
class GeoPointBrowse : StandardLookup<GeoPoint>()