package com.batyrov.erp.entity.docs

import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.metamodel.annotation.JmixEntity
import java.util.*
import javax.persistence.*
import javax.validation.constraints.NotNull

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@JmixEntity
@Table(name = "ERP_DOCUMENT", indexes = [
    Index(name = "IDX_ADVANCEPAYMENT_USER_ID", columnList = "USER_ID"),
    Index(name = "IDX_FINANCIALDOCUMENT", columnList = "CURRENCY_ID"),
    Index(name = "IDX_OUTCOMINGPAYMENT", columnList = "COST_CATEGORY_ID"),
    Index(name = "IDX_OUTCOMINGPAYMENT", columnList = "COST_CENTRE_ID"),
    Index(name = "IDX_INCOMINGPAYMENT", columnList = "INCOME_CATEGORY_ID"),
    Index(name = "IDX_PAYMENT_PROJECT_ID", columnList = "PROJECT_ID"),
    Index(name = "IDX_PAYMENT_PARTHNER_ID", columnList = "PARTHNER_ID"),
    Index(name = "IDX_INCOMINGCASHPAYMENT", columnList = "PERSON_ID"),
    Index(name = "IDX_OUTCOMINGCASHPAYMENT", columnList = "PERSON_ID")
])
@Entity(name = "erp_Document")
open class Document {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    var id: UUID? = null

    @NotNull(message = "{msg://com.batyrov.erp.entity.docs/Document.date.validation.NotNull}")
    @Column(name = "DATE_", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    var date: Date = Calendar.getInstance().time;

    @NotNull(message = "{msg://com.batyrov.erp.entity.docs/Document.isActive.validation.NotNull}")
    @Column(name = "IS_ACTIVE", nullable = false)
    var isActive: Boolean? = false
        private set

}