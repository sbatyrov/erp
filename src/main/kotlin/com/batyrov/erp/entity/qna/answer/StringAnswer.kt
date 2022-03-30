package com.batyrov.erp.entity.qna.answer

import io.jmix.core.metamodel.annotation.JmixEntity
import javax.persistence.Entity
import javax.persistence.Table

@JmixEntity
@Entity
@Table(name = "ANSWER_STRING")
class StringAnswer : Answer() {
    var value: String? = null
}