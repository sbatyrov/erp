package com.batyrov.erp.entity.qna

import io.jmix.core.annotation.DeletedBy
import io.jmix.core.annotation.DeletedDate
import io.jmix.core.entity.annotation.JmixGeneratedValue
import io.jmix.core.metamodel.annotation.JmixEntity
import org.springframework.data.annotation.CreatedBy
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.annotation.LastModifiedDate
import java.util.*
import javax.persistence.*

@JmixEntity
@Table(name = "ERP_QUESTION_GROUP")
@Entity(name = "erp_QuestionGroup")
open class QuestionGroup {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    var id: UUID? = null

    @Column(name = "VERSION", nullable = false)
    @Version
    var version: Int? = null

    @CreatedBy
    @Column(name = "CREATED_BY")
    var createdBy: String? = null

    @CreatedDate
    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    var createdDate: Date? = null

    @LastModifiedBy
    @Column(name = "LAST_MODIFIED_BY")
    var lastModifiedBy: String? = null

    @LastModifiedDate
    @Column(name = "LAST_MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    var lastModifiedDate: Date? = null

    @DeletedBy
    @Column(name = "DELETED_BY")
    var deletedBy: String? = null

    @DeletedDate
    @Column(name = "DELETED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    var deletedDate: Date? = null

    @Column(name = "_NAME")
    var name : String? = null

    @OneToMany(mappedBy = "questionGroup")
    var questions : MutableList<Question> = mutableListOf()

    @ManyToOne
    var parentGroup : QuestionGroup? = null

    @OneToMany(mappedBy = "parentGroup")
    var groups : MutableList<QuestionGroup> = mutableListOf()

    // Если указана группа запуска, то это означает что после заполнения данного поля необходимо будет запустить
    // вопросы из группы в таком количестве, сколько было введено
    @ManyToMany(mappedBy = "executeQuestionGroups")
    var executeQuestions : MutableList<Question> = mutableListOf()

}