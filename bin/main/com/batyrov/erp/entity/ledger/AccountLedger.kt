package com.batyrov.erp.entity.ledger

import com.batyrov.erp.entity.reference.AccountInstance
import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.metamodel.annotation.JmixEntity
import java.math.BigDecimal
import java.util.*
import javax.persistence.*

@JmixEntity
@Table(name = "ERP_ACCOUNT_LEDGER", indexes = [
    Index(name = "IDX_ACCOUNTLEDGER", columnList = "ACCOUNT_INSTANCE_ID")
])
@Entity(name = "erp_AccountLedger")
open class AccountLedger {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    var id: UUID? = null

    @JoinColumn(name = "ACCOUNT_INSTANCE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var accountInstance: AccountInstance? = null

    @Column(name = "AMOUNT", precision = 19, scale = 2)
    var amount: BigDecimal? = null

    @Column(name = "TYPE_")
    var type: Boolean? = null
}