package com.batyrov.erp.entity.reference

import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.metamodel.annotation.InstanceName
import io.jmix.core.metamodel.annotation.JmixEntity
import java.util.*
import javax.persistence.*

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@JmixEntity
@Table(name = "ERP_WALLET")
@Entity(name = "erp_Wallet")
open class Wallet {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    var id: UUID? = null

    @InstanceName
    @Column(name = "NAME", nullable = false)
    var name: String? = null
}