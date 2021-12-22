package com.batyrov.erp.entity.docs

import com.batyrov.erp.entity.reference.Wallet
import io.jmix.core.metamodel.annotation.JmixEntity
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@JmixEntity
@Entity(name = "erp_CashDocument")
open class CashDocument : FinancialDocument() {
    @JoinColumn(name = "WALLET_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var wallet: Wallet? = null
}