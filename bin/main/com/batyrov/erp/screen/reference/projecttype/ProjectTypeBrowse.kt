package com.batyrov.erp.screen.reference.projecttype

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.reference.ProjectType

@UiController("erp_ProjectType.browse")
@UiDescriptor("project-type-browse.xml")
@LookupComponent("projectTypesTable")
class ProjectTypeBrowse : StandardLookup<ProjectType>()