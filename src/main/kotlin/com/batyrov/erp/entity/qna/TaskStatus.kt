package com.batyrov.erp.entity.qna

import io.jmix.core.metamodel.datatype.impl.EnumClass

enum class TaskStatus(private val id: Int) : EnumClass<Int> {

    PROVEDEN(1),
    NEPROVEDEN(0);

    override fun getId() = id

    companion object {

        @JvmStatic
        fun fromId(id: Int): TaskStatus? = TaskStatus.values().find { it.id == id }
    }
}