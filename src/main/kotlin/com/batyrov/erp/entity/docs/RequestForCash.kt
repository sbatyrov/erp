package com.batyrov.erp.entity.docs

import com.batyrov.erp.entity.reference.*
import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.metamodel.annotation.JmixEntity
import java.math.BigDecimal
import java.util.*
import javax.persistence.*

@JmixEntity
@Table(name = "ERP_REQUEST_FOR_CASH", indexes = [
    Index(name = "IDX_REQUESTFORCASH", columnList = "COST_CENTRE_ID"),
    Index(name = "IDX_REQUESTFORCASH", columnList = "COST_CATEGORY_ID"),
    Index(name = "IDX_REQUESTFORCASH", columnList = "PROJECT_ID"),
    Index(name = "IDX_REQUESTFORCASH", columnList = "CONTRACT_ID"),
    Index(name = "IDX_REQUESTFORCASH", columnList = "CONTRACT_ORDER_ID"),
    Index(name = "IDX_REQUESTFORCASH_PERSON_ID", columnList = "PERSON_ID"),
    Index(name = "IDX_REQUESTFORCASH_PARTNER_ID", columnList = "PARTNER_ID")
])
@Entity(name = "erp_RequestForCash")
open class RequestForCash {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    var id: UUID? = null

    @JoinColumn(name = "PERSON_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var person: Person? = null

    @JoinColumn(name = "PARTNER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var partner: Parthner? = null

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

}