package com.batyrov.erp.screen.reference.project

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.reference.Project

@UiController("erp_Projects.edit")
@UiDescriptor("project-edit.xml")
@EditedEntityContainer("projectDc")
class ProjectEdit : StandardEditor<Project>()