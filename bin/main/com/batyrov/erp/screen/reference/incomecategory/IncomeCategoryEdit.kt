package com.batyrov.erp.screen.reference.incomecategory

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.reference.IncomeCategory

@UiController("erp_IncomeCategory.edit")
@UiDescriptor("income-category-edit.xml")
@EditedEntityContainer("incomeCategoryDc")
class IncomeCategoryEdit : StandardEditor<IncomeCategory>()