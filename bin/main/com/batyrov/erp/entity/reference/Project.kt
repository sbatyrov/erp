package com.batyrov.erp.entity.reference

import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.metamodel.annotation.InstanceName
import io.jmix.core.metamodel.annotation.JmixEntity
import java.util.*
import javax.persistence.*

@JmixEntity
@Table(name = "ERP_PROJECT", indexes = [
    Index(name = "IDX_PROJECT_BUSINESS_UNIT_ID", columnList = "BUSINESS_UNIT_ID"),
    Index(name = "IDX_PROJECT_PROJECT_TYPE_ID", columnList = "PROJECT_TYPE_ID")
])
@Entity(name = "erp_Projects")
open class Project {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    var id: UUID? = null

    @InstanceName
    @Column(name = "NAME")
    var name: String? = null

    @JoinTable(
        name = "ERP_PROJECT_CONTRACT_LINK",
    joinColumns = [JoinColumn(name = "PROJECT_ID")],
    inverseJoinColumns = [JoinColumn(name = "CONTRACT_ID")])
    @ManyToMany
    var contract: MutableList<Contract> = mutableListOf()

    @JoinColumn(name = "BUSINESS_UNIT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var businessUnit: BusinessUnit? = null

    @JoinColumn(name = "PROJECT_TYPE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var projectType: ProjectType? = null

}