package com.batyrov.erp.entity.docs

import com.batyrov.erp.entity.reference.Currency
import io.jmix.core.metamodel.annotation.JmixEntity
import java.math.BigDecimal
import javax.persistence.*
import javax.validation.constraints.NotNull

@JmixEntity
@Entity(name = "erp_FinancialDocument")
open class FinancialDocument : Document() {
    @NotNull
    @Column(name = "AMOUNT", nullable = false, precision = 19, scale = 2)
    var amount: BigDecimal = BigDecimal(0)

    @JoinColumn(name = "CURRENCY_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var currency: Currency? = null


}