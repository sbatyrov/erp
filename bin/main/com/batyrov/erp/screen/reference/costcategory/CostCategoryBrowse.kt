package com.batyrov.erp.screen.reference.costcategory

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.reference.CostCategory

@UiController("erp_CostCategory.browse")
@UiDescriptor("cost-category-browse.xml")
@LookupComponent("costCategoriesTable")
class CostCategoryBrowse : StandardLookup<CostCategory>()