package com.batyrov.erp.screen.reference.businessunit

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.reference.BusinessUnit

@UiController("erp_BusinessUnit.browse")
@UiDescriptor("business-unit-browse.xml")
@LookupComponent("businessUnitsTable")
class BusinessUnitBrowse : StandardLookup<BusinessUnit>()