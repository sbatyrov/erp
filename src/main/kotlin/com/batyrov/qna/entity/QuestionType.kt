package com.batyrov.qna.entity

import io.jmix.core.metamodel.datatype.impl.EnumClass

enum class QuestionType(private val id: Int) : EnumClass<Int> {

    ;

    override fun getId() = id

    companion object {

        @JvmStatic
        fun fromId(id: Int): QuestionType? = QuestionType.values().find { it.id == id }
    }
}