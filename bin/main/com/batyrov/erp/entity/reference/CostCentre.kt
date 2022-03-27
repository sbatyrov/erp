package com.batyrov.erp.entity.reference

import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.metamodel.annotation.InstanceName
import io.jmix.core.metamodel.annotation.JmixEntity
import java.util.*
import javax.persistence.*

@JmixEntity
@Table(name = "ERP_COST_CENTRE", indexes = [
    Index(name = "IDX_COSTCENTRE_OWNER_ID", columnList = "OWNER_ID")
])
@Entity(name = "erp_CostCentre")
open class CostCentre {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    var id: UUID? = null

    @JoinColumn(name = "OWNER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var owner: User? = null

    @InstanceName
    @Column(name = "NAME")
    var name: String? = null

}