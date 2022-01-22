package com.batyrov.erp.screen.reference.projecttype

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.reference.ProjectType

@UiController("erp_ProjectType.edit")
@UiDescriptor("project-type-edit.xml")
@EditedEntityContainer("projectTypeDc")
class ProjectTypeEdit : StandardEditor<ProjectType>()