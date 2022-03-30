package com.batyrov.erp.entity.qna

import io.jmix.core.metamodel.datatype.impl.EnumClass

enum class AnswerType(private val id: Int) : EnumClass<Int> {
    INT(1),
    STRING(0),
    DOUBLE(2),
    LIST(3),
    PHOTO(4),
    VIDEO(5),
    FILEREF(6),
    BOOL(7);


    override fun getId() = id

    companion object {

        @JvmStatic
        fun fromId(id: Int): AnswerType? = AnswerType.values().find { it.id == id }
    }
}