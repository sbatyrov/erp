package com.batyrov.erp.entity.docs

import com.batyrov.erp.entity.reference.*
import io.jmix.core.annotation.DeletedBy
import io.jmix.core.annotation.DeletedDate
import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.metamodel.annotation.InstanceName
import io.jmix.core.metamodel.annotation.JmixEntity
import org.springframework.data.annotation.CreatedBy
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.annotation.LastModifiedDate
import java.math.BigDecimal
import java.util.*
import javax.persistence.*
import javax.validation.constraints.NotNull

@JmixEntity
@Table(name = "ERP_REQUEST_FOR_OUTCOME", indexes = [
    Index(name = "IDX_REQUESTFOROUTCOME", columnList = "COST_CENTRE_ID"),
    Index(name = "IDX_REQUESTFOROUTCOME", columnList = "COST_CATEGORY_ID"),
    Index(name = "IDX_REQUESTFOROUTCOME", columnList = "PROJECT_ID"),
    Index(name = "IDX_REQUESTFOROUTCOME", columnList = "CONTRACT_ID"),
    Index(name = "IDX_REQUESTFOROUTCOME", columnList = "CONTRACT_ORDER_ID")
])
@Entity(name = "erp_RequestForOutcome")
open class RequestForOutcome {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    var id: UUID? = null

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

    @OneToMany(mappedBy = "request")
    var wares: MutableList<RFOWares> = mutableListOf()

    @OneToMany(mappedBy = "request")
    var services: MutableList<RFOServices> = mutableListOf()

    @NotNull
    @Column(name = "AMOUNT", nullable = false, precision = 19, scale = 2)
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

    @NotNull
    @JoinColumn(name = "COST_CENTRE_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    var costCentre: CostCentre? = null

    @NotNull
    @JoinColumn(name = "COST_CATEGORY_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    var costCategory: CostCategory? = null

    @InstanceName
    @Column(name = "DESCRIPTION")
    @Lob
    var description: String? = null



}