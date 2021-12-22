package com.batyrov.erp.screen.reference.company

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.reference.Company

@UiController("erp_Company.edit")
@UiDescriptor("company-edit.xml")
@EditedEntityContainer("companyDc")
class CompanyEdit : StandardEditor<Company>()