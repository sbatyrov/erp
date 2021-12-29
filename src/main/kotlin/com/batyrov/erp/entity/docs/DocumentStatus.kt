package com.batyrov.erp.entity.docs

import io.jmix.core.metamodel.datatype.impl.EnumClass

enum class DocumentStatus(private val id: Int) : EnumClass<Int> {
    PROVEDEN(1),
    NEPROVEDEN(0);

    override fun getId() = id

    companion object {

        @JvmStatic
        fun fromId(id: Int): DocumentStatus? = DocumentStatus.values().find { it.id == id }
    }
}