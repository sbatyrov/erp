package com.batyrov.erp.entity.qna.answer

import io.jmix.core.metamodel.annotation.JmixEntity
import javax.persistence.Entity
import javax.persistence.Table

@JmixEntity
@Entity
@Table(name = "ANSWER_INT")
class IntAnswer : Answer() {
    var value: Int? = null
}