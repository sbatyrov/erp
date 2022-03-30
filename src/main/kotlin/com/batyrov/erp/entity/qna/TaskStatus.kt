package com.batyrov.erp.entity.qna

import io.jmix.core.metamodel.datatype.impl.EnumClass

enum class TaskStatus(private val id: Int) : EnumClass<Int> {

    CLOSE(1),
    NEW(0),
    IN_PROGRESS(2);

    override fun getId() = id

    companion object {

        @JvmStatic
        fun fromId(id: Int): TaskStatus? = TaskStatus.values().find { it.id == id }
    }
}