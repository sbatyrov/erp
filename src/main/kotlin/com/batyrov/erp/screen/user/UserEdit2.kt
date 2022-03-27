package com.batyrov.erp.screen.user

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.reference.User

@UiController("erp_User.edit2")
@UiDescriptor("user-edit2.xml")
@EditedEntityContainer("userDc")
class UserEdit2 : StandardEditor<User>()