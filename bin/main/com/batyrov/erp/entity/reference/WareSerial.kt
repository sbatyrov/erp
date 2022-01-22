package com.batyrov.erp.entity.reference

import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.metamodel.annotation.JmixEntity
import java.util.*
import javax.persistence.*

@Table(name = "ERP_WARE_SERIAL", indexes = [
    Index(name = "IDX_WARESERIAL_WARE_ID", columnList = "WARE_ID")
])
@JmixEntity
@Entity(name = "erp_WareSerial")
open class WareSerial {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    var id: UUID? = null

    @Column(name = "SERIAL")
    var serial: String? = null

    @JoinColumn(name = "WARE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var ware: Ware? = null
}