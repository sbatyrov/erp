package com.batyrov.qna.entity

import io.jmix.core.metamodel.datatype.impl.EnumClass

enum class TaskStatus(private val id: Int) : EnumClass<Int> {

    ;

    override fun getId() = id

    companion object {

        @JvmStatic
        fun fromId(id: Int): TaskStatus? = TaskStatus.values().find { it.id == id }
    }
}