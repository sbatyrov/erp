package com.batyrov.erp.entity.docs

import io.jmix.core.metamodel.annotation.JmixEntity
import javax.persistence.Entity

@JmixEntity
@Entity(name = "erp_RequestForPurchase")
open class RequestForPurchase : RequestForOutcome() {

}