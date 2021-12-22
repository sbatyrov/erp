package com.batyrov.erp.entity.docs

import com.batyrov.erp.entity.reference.*
import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.metamodel.annotation.InstanceName
import io.jmix.core.metamodel.annotation.JmixEntity
import java.math.BigDecimal
import java.util.*
import javax.persistence.*

@JmixEntity
@Table(name = "ERP_REQUEST_FOR_PURCHASE", indexes = [
    Index(name = "IDX_REQUESTFORPURCHASE", columnList = "COST_CENTRE_ID"),
    Index(name = "IDX_REQUESTFORPURCHASE", columnList = "COST_CATEGORY_ID"),
    Index(name = "IDX_REQUESTFORPURCHASE", columnList = "PROJECT_ID"),
    Index(name = "IDX_REQUESTFORPURCHASE", columnList = "CONTRACT_ID"),
    Index(name = "IDX_REQUESTFORPURCHASE", columnList = "CONTRACT_ORDER_ID")
])
@Entity(name = "erp_RequestForPurchase")
open class RequestForPurchase {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    var id: UUID? = null

    @OneToMany(mappedBy = "request")
    var wares: MutableList<RequestForPurchaseDetail> = mutableListOf()

    @Column(name = "AMOUNT", precision = 19, scale = 2)
    var amount: BigDecimal? = null

    @JoinColumn(name = "CONTRACT_ORDER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var contractOrder: ContractOrder? = null

    @JoinColumn(name = "CONTRACT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var contract: Contract? = null

    @JoinColumn(name = "PROJECT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var project: Project? = null

    @JoinColumn(name = "COST_CENTRE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var costCentre: CostCentre? = null

    @JoinColumn(name = "COST_CATEGORY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var costCategory: CostCategory? = null

    @InstanceName
    @Column(name = "DESCRIPTION")
    @Lob
    var description: String? = null

}