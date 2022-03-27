package com.batyrov.erp.security

import com.batyrov.erp.entity.reference.Company
import com.batyrov.erp.entity.reference.User
import io.jmix.security.model.RowLevelPolicyAction
import io.jmix.security.model.RowLevelPredicate
import io.jmix.security.role.annotation.JpqlRowLevelPolicy
import io.jmix.security.role.annotation.PredicateRowLevelPolicy
import io.jmix.security.role.annotation.RowLevelRole
import java.lang.Boolean


@RowLevelRole(name = "Company Full Access", code = "same-company-rows")
interface CompanyFullAccessRole {
    @JpqlRowLevelPolicy(
        entityClass = User::class,
        where = "{E}.company = :current_user_company"
    )
    fun user();

    @JpqlRowLevelPolicy(
        entityClass = Company::class,
        where = "{E} = :current_user_company"
    )
    fun company();

    /*@PredicateRowLevelPolicy(entityClass = User::class, actions = [RowLevelPolicyAction.READ,RowLevelPolicyAction.CREATE, RowLevelPolicyAction.DELETE, RowLevelPolicyAction.UPDATE])
    fun customerDetailNotConfidential(): RowLevelPredicate<User>? {
        return RowLevelPredicate<User> { user: User -> Boolean.TRUE != user.company }
    }*/
}