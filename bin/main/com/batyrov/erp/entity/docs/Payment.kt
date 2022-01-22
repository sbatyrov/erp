package com.batyrov.erp.entity.docs

import com.batyrov.erp.entity.reference.Parthner
import com.batyrov.erp.entity.reference.Project
import io.jmix.core.metamodel.annotation.JmixEntity
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@JmixEntity
@Entity(name = "erp_Payment")
open class Payment : FinancialDocument() {

    @JoinColumn(name = "PROJECT_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var project: Project? = null

    @JoinColumn(name = "PARTHNER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    var parthner: Parthner? = null
}