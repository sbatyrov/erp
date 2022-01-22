package com.batyrov.erp.screen.reference.person

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.reference.Person

@UiController("erp_Person.browse")
@UiDescriptor("person-browse.xml")
@LookupComponent("personsTable")
class PersonBrowse : StandardLookup<Person>()