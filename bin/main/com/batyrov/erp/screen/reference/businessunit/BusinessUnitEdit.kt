package com.batyrov.erp.screen.reference.businessunit

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.reference.BusinessUnit

@UiController("erp_BusinessUnit.edit")
@UiDescriptor("business-unit-edit.xml")
@EditedEntityContainer("businessUnitDc")
class BusinessUnitEdit : StandardEditor<BusinessUnit>()