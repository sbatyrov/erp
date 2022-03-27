package com.batyrov.erp.screen.reference.person

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.reference.Person

@UiController("erp_Person.edit")
@UiDescriptor("person-edit.xml")
@EditedEntityContainer("personDc")
class PersonEdit : StandardEditor<Person>()