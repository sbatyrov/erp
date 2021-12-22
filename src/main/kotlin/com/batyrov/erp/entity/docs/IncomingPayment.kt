package com.batyrov.erp.entity.docs

import com.batyrov.erp.entity.reference.IncomeCategory
import io.jmix.core.metamodel.annotation.JmixEntity
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@JmixEntity
@Entity(name = "erp_IncomingPayment")
open class IncomingPayment : Payment() {
    @JoinColumn(name = "INCOME_CATEGORY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var incomeCategory: IncomeCategory? = null
}