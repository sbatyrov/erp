package com.batyrov.erp.entity.reference

import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.metamodel.annotation.InstanceName
import io.jmix.core.metamodel.annotation.JmixEntity
import java.util.*
import javax.persistence.*

@JmixEntity
@Table(name = "ERP_WAREHOUSE", indexes = [
    Index(name = "IDX_WAREHOUSE_OWNER_ID", columnList = "OWNER_ID"),
    Index(name = "IDX_WAREHOUSE_RESPONSIBLE_ID", columnList = "RESPONSIBLE_ID")
])
@Entity(name = "erp_Warehouse")
open class Warehouse {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    var id: UUID? = null


    @JoinColumn(name = "OWNER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var owner: User? = null

    @JoinColumn(name = "RESPONSIBLE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var responsible: User? = null

    @InstanceName
    @Column(name = "NAME")
    var name: String? = null

}