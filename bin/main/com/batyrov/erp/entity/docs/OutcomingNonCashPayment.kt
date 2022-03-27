package com.batyrov.erp.entity.docs

import io.jmix.core.FileRef
import io.jmix.core.metamodel.annotation.JmixEntity
import javax.persistence.Column
import javax.persistence.Entity

/// Реестр исходящих безналичных платежей
@JmixEntity
@Entity(name = "erp_OutcomingNonCashPayment")
open class OutcomingNonCashPayment : OutcomingPayment() {
    @Column(name = "INVOICE", length = 1024)
    var invoice: FileRef? = null

}