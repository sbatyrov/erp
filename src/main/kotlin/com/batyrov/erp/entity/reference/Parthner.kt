package com.batyrov.erp.entity.reference

import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.metamodel.annotation.InstanceName
import io.jmix.core.metamodel.annotation.JmixEntity
import java.util.*
import javax.persistence.*

@JmixEntity
@Table(name = "ERP_PARTHNER")
@Entity(name = "erp_Parthner")
open class Parthner {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    var id: UUID? = null

    @InstanceName
    @Column(name = "NAME")
    var name: String? = null

    @JoinTable(
        name = "ERP_PERSON_PARTHNER_LINK",
        joinColumns = [JoinColumn(name = "PARTHNER_ID")],
        inverseJoinColumns = [JoinColumn(name = "PERSON_ID")]
    )
    @ManyToMany
    var persons: MutableList<Person> = mutableListOf()
}