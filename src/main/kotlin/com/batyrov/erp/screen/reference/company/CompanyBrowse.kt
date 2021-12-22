package com.batyrov.erp.screen.reference.company

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.reference.Company

@UiController("erp_Company.browse")
@UiDescriptor("company-browse.xml")
@LookupComponent("companiesTable")
class CompanyBrowse : StandardLookup<Company>()