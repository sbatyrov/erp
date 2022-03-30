package com.batyrov.erp.entity.qna.answer

import com.batyrov.erp.entity.qna.ReferenceValue
import io.jmix.core.metamodel.annotation.JmixEntity
import org.jetbrains.annotations.NotNull
import javax.persistence.Entity
import javax.persistence.ManyToOne
import javax.persistence.Table

@JmixEntity
@Entity
@Table(name = "ANSWER_LIST")
class ListAnswer : Answer() {
    @NotNull
    @ManyToOne
    var value : ReferenceValue? = null
}