package com.batyrov.erp.entity.docs

import com.batyrov.erp.entity.reference.Ware
import io.jmix.core.DeletePolicy
import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.entity.annotation.OnDeleteInverse
import io.jmix.core.metamodel.annotation.JmixEntity
import java.util.*
import javax.persistence.*
import javax.validation.constraints.NotNull

@JmixEntity
@Table(name = "ERP_REQUEST_FOR_PURCHASE_DETAI", indexes = [
    Index(name = "IDX_REQUESTFORPURCHASEDETAIL", columnList = "REQUEST_ID"),
    Index(name = "IDX_REQUESTFORPURCHASEDETAIL", columnList = "WARE_ID"),
    Index(name = "IDX_ERP_REQUEST_FOR_PURCHASE_DETAIL_UNQ", columnList = "REQUEST_ID, WARE_ID", unique = true),
    Index(name = "IDX_REQUESTFORPURCHASEDETAIL", columnList = "REQUEST_ID")
])
@Entity(name = "erp_RequestForPurchaseDetail")
open class RequestForPurchaseDetail {
    
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    var id: UUID? = null

    @NotNull
    @OnDeleteInverse(DeletePolicy.DENY)
    @JoinColumn(name = "WARE_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    var ware: Ware? = null

    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "REQUEST_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var request: RequestForOutcome? = null

    @NotNull(message = "count cannot be null")
    @Column(name = "COUNT_", nullable = false)
    var count: Int? = null

}