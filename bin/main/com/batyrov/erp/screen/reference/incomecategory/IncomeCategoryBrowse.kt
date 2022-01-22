package com.batyrov.erp.screen.reference.incomecategory

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.reference.IncomeCategory

@UiController("erp_IncomeCategory.browse")
@UiDescriptor("income-category-browse.xml")
@LookupComponent("incomeCategoriesTable")
class IncomeCategoryBrowse : StandardLookup<IncomeCategory>()