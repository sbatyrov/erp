package com.batyrov.erp.screen.reference.costcategory

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.reference.CostCategory

@UiController("erp_CostCategory.edit")
@UiDescriptor("cost-category-edit.xml")
@EditedEntityContainer("costCategoryDc")
class CostCategoryEdit : StandardEditor<CostCategory>()