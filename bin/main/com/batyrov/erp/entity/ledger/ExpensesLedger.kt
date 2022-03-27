package com.batyrov.erp.entity.ledger

import com.batyrov.erp.entity.docs.OutcomingPayment
import com.batyrov.erp.entity.reference.CostCategory
import com.batyrov.erp.entity.reference.CostCentre
import io.jmix.core.metamodel.annotation.JmixEntity
import javax.persistence.*

@Table(name = "ERP_EXPENSES_LEDGER")
@JmixEntity
@Entity(name = "erp_ExpensesLedger")
open class ExpensesLedger : FinancialLedger() {
    // Книга расходов. Указываем расходы, по какой категории расходов их понесли
    @JoinColumn(name = "COST_CATEGORY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var costCategory: CostCategory? = null

    @JoinColumn(name = "COST_CENTRE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var costCentre: CostCentre? = null

    fun build(outcomingPayment : OutcomingPayment){
            this.costCategory = outcomingPayment.costCategory
            this.costCentre = outcomingPayment.costCentre
            this.currency = outcomingPayment.currency
            this.project = outcomingPayment.project
            this.date = outcomingPayment.date
            this.amount = outcomingPayment.amount
            this.parthner = outcomingPayment.parthner
            this.document = outcomingPayment
    }

}