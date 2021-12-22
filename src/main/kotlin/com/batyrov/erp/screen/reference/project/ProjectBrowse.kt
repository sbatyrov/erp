package com.batyrov.erp.screen.reference.project

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.reference.Project

@UiController("erp_Projects.browse")
@UiDescriptor("project-browse.xml")
@LookupComponent("projectsTable")
class ProjectBrowse : StandardLookup<Project>()