package com.batyrov.erp.entity.docs

import io.jmix.core.FileRef
import io.jmix.core.metamodel.annotation.JmixEntity
import javax.persistence.Column
import javax.persistence.Entity


/// Реестр входящих безналичных платежей
@JmixEntity
@Entity(name = "erp_IncomingNonCashPayment")
open class IncomingNonCashPayment : IncomingPayment() {
    @Column(name = "INVOICE", length = 1024)
    var invoice: FileRef? = null

}