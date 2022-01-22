package com.batyrov.erp.screen.user

import com.batyrov.erp.entity.reference.User
import io.jmix.ui.navigation.Route
import io.jmix.ui.screen.*

@UiController("erp_User.browse")
@UiDescriptor("user-browse.xml")
@LookupComponent("usersTable")
@Route("users")
open class UserBrowse : StandardLookup<User>()