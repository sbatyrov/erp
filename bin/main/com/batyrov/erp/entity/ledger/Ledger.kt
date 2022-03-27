package com.batyrov.erp.entity.ledger

import com.batyrov.erp.entity.docs.Document
import io.jmix.core.DeletePolicy
import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.entity.annotation.OnDeleteInverse
import io.jmix.core.metamodel.annotation.JmixEntity
import java.util.*
import javax.persistence.*
import javax.validation.constraints.NotNull

@Inheritance(strategy = InheritanceType.JOINED)
@JmixEntity
@Table(name = "ERP_LEDGER", indexes = [
    Index(name = "IDX_LEDGER_DOCUMENT_ID", columnList = "DOCUMENT_ID")
])
@Entity(name = "erp_Ledger")
open class Ledger {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    var id: UUID? = null

    @Column(name = "DATE_")
    @Temporal(TemporalType.TIMESTAMP)
    var date: Date? = null

    @NotNull(message = "{msg://com.batyrov.erp.entity.ledger/Ledger.document.validation.NotNull}")
    @OnDeleteInverse(DeletePolicy.CASCADE)
    @JoinColumn(name = "DOCUMENT_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    var document: Document? = null // Регистратор

}