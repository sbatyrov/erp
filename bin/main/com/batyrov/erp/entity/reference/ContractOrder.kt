package com.batyrov.erp.entity.reference

import io.jmix.core.FileRef
import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.metamodel.annotation.InstanceName
import io.jmix.core.metamodel.annotation.JmixEntity
import java.util.*
import javax.persistence.*

@JmixEntity
@Table(name = "ERP_CONTRACT_ORDER", indexes = [
    Index(name = "IDX_CONTRACTORDER_CONTRACT_ID", columnList = "CONTRACT_ID")
])
@Entity(name = "erp_ContractOrder")
open class ContractOrder {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    var id: UUID? = null

    @InstanceName
    @Column(name = "NAME")
    var name: String? = null

    @Column(name = "ORDER_FILE", length = 1024)
    var orderFile: FileRef? = null

    @JoinColumn(name = "CONTRACT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var contract: Contract? = null

}