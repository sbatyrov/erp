package com.batyrov.erp.entity.qna

import io.jmix.core.metamodel.datatype.impl.EnumClass

enum class QuestionType(private val id: Int) : EnumClass<Int> {
    PROVEDEN(1),
    NEPROVEDEN(0);

    override fun getId() = id

    companion object {

        @JvmStatic
        fun fromId(id: Int): QuestionType? = QuestionType.values().find { it.id == id }
    }
}