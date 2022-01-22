package com.batyrov.erp.entity.ledger

import com.batyrov.erp.entity.docs.IncomingPayment
import com.batyrov.erp.entity.reference.IncomeCategory
import io.jmix.core.metamodel.annotation.JmixEntity
import javax.persistence.*

@Table(name = "ERP_INCOME_LEDGER")
@JmixEntity
@Entity(name = "erp_IncomeLedger")
open class IncomeLedger : FinancialLedger() {
    fun build(incomingPayment: IncomingPayment) {
        this.incomeCategory = incomingPayment.incomeCategory
        this.parthner = incomingPayment.parthner
        this.amount = incomingPayment.amount
        this.currency = incomingPayment.currency
        this.date = incomingPayment.date
        this.project = incomingPayment.project
        this.document = incomingPayment
    }

    @JoinColumn(name = "INCOME_CATEGORY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var incomeCategory: IncomeCategory? = null

// книга доходов, заносим информацию по полученным платежам-деньгам, без разницы от какого направления мы получили эти доходы.
    //
}