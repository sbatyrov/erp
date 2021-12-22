package com.batyrov.erp.entity.ledger

import com.batyrov.erp.entity.reference.Ware
import com.batyrov.erp.entity.reference.WareSerial
import com.batyrov.erp.entity.reference.Warehouse
import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.metamodel.annotation.JmixEntity
import java.util.*
import javax.persistence.*

@JmixEntity
@Table(name = "ERP_WAREHOUSE_LEDGER", indexes = [
    Index(name = "IDX_WAREHOUSELEDGER_WARE_ID", columnList = "WARE_ID"),
    Index(name = "IDX_WAREHOUSELEDGER", columnList = "WARE_SERIAL_ID")
])
@Entity(name = "erp_WarehouseLedger")
open class WarehouseLedger {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    var id: UUID? = null

    open lateinit var warehouse: Warehouse

    @Column(name = "WARE_COUNT", nullable = false)
    open var wareCount: Long ? = 0


    @JoinColumn(name = "WARE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var ware: Ware? = null

    @JoinColumn(name = "WARE_SERIAL_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var wareSerial: WareSerial? = null
}