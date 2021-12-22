package com.batyrov.erp.entity.reference

import io.jmix.core.metamodel.annotation.JmixEntity
import javax.persistence.Entity
import javax.persistence.Table

@Table(name = "ERP_BANK_ACCOUNT")
@JmixEntity
@Entity(name = "erp_BankAccount")
open class BankAccount : Wallet()