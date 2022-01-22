package com.batyrov.erp.entity.docs

import com.batyrov.erp.entity.reference.User
import io.jmix.core.metamodel.annotation.JmixEntity
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@JmixEntity
@Entity(name = "erp_AdvancePayment")
open class AdvancePayment : FinancialDocument() {
    //выдача аванса
    @JoinColumn(name = "USER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var user: User? = null
}