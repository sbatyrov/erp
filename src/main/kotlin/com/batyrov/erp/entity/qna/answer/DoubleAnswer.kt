package com.batyrov.erp.entity.qna.answer

import io.jmix.core.metamodel.annotation.JmixEntity
import javax.persistence.Entity
import javax.persistence.Table

@JmixEntity
@Entity
@Table(name = "ANSWER_DOUBLE")
class DoubleAnswer: Answer() {
    var value: Double? = null
}