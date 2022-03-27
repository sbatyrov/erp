package com.batyrov.erp.entity.ledger

import com.batyrov.erp.entity.reference.Currency
import com.batyrov.erp.entity.reference.Parthner
import com.batyrov.erp.entity.reference.Project
import io.jmix.core.DeletePolicy
import io.jmix.core.entity.annotation.OnDeleteInverse
import io.jmix.core.metamodel.annotation.JmixEntity
import java.math.BigDecimal
import javax.persistence.*
import javax.validation.constraints.NotNull

@Table(name = "ERP_FINANCIAL_LEDGER")
@JmixEntity
@Entity(name = "erp_FinancialLedger")
open class FinancialLedger : Ledger() {
    // Универсальная финансовая книга, куда можно записать любые финансовые транзакции с указанием проекта касательно которого их произвели.
    @OnDeleteInverse(DeletePolicy.DENY)
    @JoinColumn(name = "PROJECT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var project: Project? = null

    @NotNull
    @OnDeleteInverse(DeletePolicy.DENY)
    @JoinColumn(name = "CURRENCY_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    var currency: Currency? = null

    @NotNull
    @OnDeleteInverse(DeletePolicy.DENY)
    @JoinColumn(name = "PARTHNER_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    var parthner: Parthner? = null

    @Column(name = "AMOUNT", precision = 19, scale = 2)
    var amount: BigDecimal? = null


}