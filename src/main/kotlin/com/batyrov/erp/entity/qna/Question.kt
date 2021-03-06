package com.batyrov.erp.entity.qna

import com.batyrov.erp.entity.docs.DocumentStatus
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
@Table(name = "ERP_QUESTION")
@Entity(name = "erp_Question")
open class Question {
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

    @Column
    var name: String? = null

    @Column(name="NULLABLE", nullable = false)
    var nullable: Boolean? = true


    @ManyToOne(fetch = FetchType.LAZY)
    var questionnaireConfig: QuestionnaireConfig? = null

    @ManyToOne(fetch = FetchType.LAZY)
    var questionGroup : QuestionGroup? = null


    @Column(name="ANSWER_TYPE", nullable = false)
    private var answerType: Int? = null

    // Если указана группа запуска, то это означает что после заполнения данного поля необходимо будет запустить
    // вопросы из группы в таком количестве, сколько было введено
    @ManyToMany
    var executeQuestionGroups : MutableList<QuestionGroup> = mutableListOf()

    fun getAnswerType(): AnswerType? = answerType?.let { AnswerType.fromId(it) }
    fun setAnswerType(answerType: AnswerType?) {
        this.answerType = answerType?.id
    }
}