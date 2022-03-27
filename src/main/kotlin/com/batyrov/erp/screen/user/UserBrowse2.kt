package com.batyrov.erp.screen.user

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.reference.User

@UiController("erp_User.browse2")
@UiDescriptor("user-browse2.xml")
@LookupComponent("usersTable")
class UserBrowse2 : StandardLookup<User>()