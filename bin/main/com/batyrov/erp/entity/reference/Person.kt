package com.batyrov.erp.entity.reference

import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.metamodel.annotation.InstanceName
import io.jmix.core.metamodel.annotation.JmixEntity
import java.util.*
import javax.persistence.*

@JmixEntity
@Table(name = "ERP_PERSON", indexes = [
    Index(name = "IDX_PERSON_USER_ID", columnList = "USER_ID")
])
@Entity(name = "erp_Person")
open class Person {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    var id: UUID? = null

    @InstanceName
    @Column(name = "NAME")
    var name: String? = null

    @JoinColumn(name = "USER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var user: User? = null

    @JoinTable(
        name = "ERP_PERSON_PARTHNER_LINK",
        joinColumns = [JoinColumn(name = "PERSON_ID")],
        inverseJoinColumns = [JoinColumn(name = "PARTHNER_ID")]
    )
    @ManyToMany
    var parthners: MutableList<Parthner> = mutableListOf()
}