package com.batyrov.erp.entity.docs

import com.batyrov.erp.entity.reference.CostCategory
import com.batyrov.erp.entity.reference.CostCentre
import io.jmix.core.metamodel.annotation.JmixEntity
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@JmixEntity
@Entity(name = "erp_OutcomingPayment")
open class OutcomingPayment : Payment() {
    @JoinColumn(name = "COST_CATEGORY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var costCategory: CostCategory? = null

    @JoinColumn(name = "COST_CENTRE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var costCentre: CostCentre? = null
}