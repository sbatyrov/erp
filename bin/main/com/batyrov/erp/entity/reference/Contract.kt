package com.batyrov.erp.entity.reference

import io.jmix.core.FileRef
import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.metamodel.annotation.InstanceName
import io.jmix.core.metamodel.annotation.JmixEntity
import java.math.BigDecimal
import java.util.*
import javax.persistence.*
import javax.validation.constraints.NotNull

@JmixEntity
@Table(name = "ERP_CONTRACT", indexes = [
    Index(name = "IDX_CONTRACT_CURRENCY_ID", columnList = "CURRENCY_ID"),
    Index(name = "IDX_CONTRACT_COMPANY_ID", columnList = "COMPANY_ID"),
    Index(name = "IDX_CONTRACT_PARTHNER_ID", columnList = "PARTHNER_ID")
])
@Entity(name = "erp_Contract")
open class Contract {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    var id: UUID? = null

    @JoinColumn(name = "PARTHNER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var parthner: Parthner? = null

    @JoinColumn(name = "COMPANY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var company: Company? = null

    @NotNull
    @InstanceName
    @Column(name = "NAME", nullable = false)
    var name: String? = null

    @Column(name = "CONTRACT", length = 1024)
    var contract: FileRef? = null

    @Column(name = "AMOUNT", precision = 19, scale = 2)
    var amount: BigDecimal? = null

    @JoinColumn(name = "CURRENCY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var currency: Currency? = null

    @JoinTable(
        name = "ERP_PROJECT_CONTRACT_LINK",
        joinColumns = [JoinColumn(name = "CONTRACT_ID")],
        inverseJoinColumns = [JoinColumn(name = "PROJECT_ID")]
    )
    @ManyToMany
    var projects: MutableList<Project> = mutableListOf()

}