package com.batyrov.erp.screen.reference.ware

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.reference.Ware

@UiController("erp_Ware.edit")
@UiDescriptor("ware-edit.xml")
@EditedEntityContainer("wareDc")
class WareEdit : StandardEditor<Ware>()