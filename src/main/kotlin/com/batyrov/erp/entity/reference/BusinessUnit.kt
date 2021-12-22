package com.batyrov.erp.entity.reference

import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.metamodel.annotation.InstanceName
import io.jmix.core.metamodel.annotation.JmixEntity
import java.util.*
import javax.persistence.*

@JmixEntity
@Table(name = "ERP_BUSINESS_UNIT")
@Entity(name = "erp_BusinessUnit")
open class BusinessUnit {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    var id: UUID? = null

    @InstanceName
    @Column(name = "NAME", nullable = false)
    var name: String? = null

    @OneToMany(mappedBy = "businessUnit")
    var projects: MutableList<Project> = mutableListOf()

}