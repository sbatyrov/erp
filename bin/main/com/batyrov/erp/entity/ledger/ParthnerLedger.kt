package com.batyrov.erp.entity.ledger

import com.batyrov.erp.entity.docs.IncomingCashPayment
import com.batyrov.erp.entity.docs.OutcomingCashPayment
import com.batyrov.erp.entity.reference.Parthner
import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.metamodel.annotation.JmixEntity
import java.math.BigDecimal
import java.util.*
import javax.persistence.*
import javax.validation.constraints.NotNull

@JmixEntity
@Table(name = "ERP_PARTHNER_LEDGER", indexes = [
    Index(name = "IDX_PARTHNERLEDGER", columnList = "PARTHNER_ID")
])
@Entity(name = "erp_ParthnerLedger")
open class ParthnerLedger {
    fun income(incomingCashPayment: IncomingCashPayment) {
        income = income.plus(incomingCashPayment.amount);
        endBalance = endBalance.plus(incomingCashPayment.amount)
    }

    fun incomeDescrease(amount: BigDecimal) {
        income = income.minus(amount);
        endBalance = endBalance.minus(amount)
    }

    fun outcome(outcomingCashPayment: OutcomingCashPayment) {
        outcome = outcome.plus(outcomingCashPayment.amount!!);
        endBalance = endBalance.minus(outcomingCashPayment.amount)
    }

    fun outcomeDescrease(amount: BigDecimal) {
        outcome = outcome.minus(amount);
        endBalance = endBalance.plus(amount)
    }

    fun outcomeUpdate(oldAmount: BigDecimal, newAmount: BigDecimal) {
        var delta = newAmount-oldAmount
        outcome = outcome.minus(delta);
        endBalance = endBalance.plus(delta)
    }

    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    var id: UUID? = null

    @NotNull
    @JoinColumn(name = "PARTHNER_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    var parthner: Parthner? = null

    @NotNull
    @Column(name = "MONTH_", nullable = false)
    var month: Int? = 0

    @NotNull
    @Column(name = "YEAR_", nullable = false)
    var year: Int? = 0

    @NotNull
    @Column(name = "START_BALANCE", nullable = false, precision = 19, scale = 2)
    var startBalance: BigDecimal = BigDecimal(0);

    @NotNull
    @Column(name = "INCOME", nullable = false, precision = 19, scale = 2)
    var income: BigDecimal = BigDecimal(0);

    @NotNull
    @Column(name = "OUTCOME", nullable = false, precision = 19, scale = 2)
    var outcome: BigDecimal = BigDecimal(0);

    @NotNull
    @Column(name = "END_BALANCE", nullable = false, precision = 19, scale = 2)
    var endBalance: BigDecimal = BigDecimal(0);
}