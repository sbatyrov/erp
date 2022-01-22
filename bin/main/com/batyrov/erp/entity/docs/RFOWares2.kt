package com.batyrov.erp.entity.docs

import com.batyrov.erp.entity.reference.Ware
import io.jmix.core.DeletePolicy
import io.jmix.core.annotation.DeletedBy
import io.jmix.core.annotation.DeletedDate
import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.entity.annotation.OnDeleteInverse
import io.jmix.core.metamodel.annotation.JmixEntity
import org.springframework.data.annotation.CreatedBy
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.annotation.LastModifiedDate
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
open class RFOWares2 {

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

    @Column(name = "VERSION", nullable = false)
    @Version
    var version: Int? = null

    @CreatedBy
    @Column(name = "CREATED_BY")
    var createdBy: String? = null

    @CreatedDate
    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    var createdDate: Date? = null

    @LastModifiedBy
    @Column(name = "LAST_MODIFIED_BY")
    var lastModifiedBy: String? = null

    @LastModifiedDate
    @Column(name = "LAST_MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    var lastModifiedDate: Date? = null

    @DeletedBy
    @Column(name = "DELETED_BY")
    var deletedBy: String? = null

    @DeletedDate
    @Column(name = "DELETED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    var deletedDate: Date? = null

}