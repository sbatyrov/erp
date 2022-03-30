package com.batyrov.erp.entity.qna

import com.batyrov.erp.entity.docs.DocumentStatus
import com.batyrov.erp.entity.reference.User
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
@Table(name = "ERP_TASK")
@Entity(name = "erp_Task")
open class Task {
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

    @Column(name = "CREATE_DATE")
    var createDate: Date? = null

    @Column(name = "EXEC_DATE")
    var executionDate: Date? = null

    @Column(name = "REQ_DATE")
    var requiredDate: Date? = null

    @ManyToOne(fetch = FetchType.LAZY)
    var owner: User? = null

    @ManyToOne(fetch = FetchType.LAZY)
    var executor: User? = null

    @Column(name = "STATUS", nullable = false)
    private var status: Int? = null

    fun getStatus(): TaskStatus? = status?.let { TaskStatus.fromId(it) }
    fun setStatus(status: TaskStatus?) {
        this.status = status?.id
    }
}