package com.batyrov.erp.entity.docs

import com.batyrov.erp.entity.reference.Person
import io.jmix.core.metamodel.annotation.JmixEntity
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@JmixEntity
@Entity(name = "erp_IncomingCashPayment")
open class IncomingCashPayment : IncomingPayment() {
    @JoinColumn(name = "PERSON_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var person: Person? = null
}