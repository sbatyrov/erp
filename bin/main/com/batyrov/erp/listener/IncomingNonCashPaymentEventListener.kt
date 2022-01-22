package com.batyrov.erp.listener

import com.batyrov.erp.entity.docs.IncomingNonCashPayment
import com.batyrov.erp.entity.docs.IncomingPayment
import com.batyrov.erp.entity.ledger.IncomeLedger
import io.jmix.core.DataManager
import io.jmix.core.event.EntityChangedEvent
import io.jmix.core.event.EntityLoadingEvent
import io.jmix.core.event.EntitySavingEvent
import io.jmix.core.querycondition.PropertyCondition
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component
import org.springframework.transaction.event.TransactionalEventListener
import java.math.BigDecimal
import java.util.*
import java.util.logging.Logger

@Component("erp_IncomingNonCashPaymentEventListener")
open class IncomingNonCashPaymentEventListener {

    @Autowired
    private val dataManager: DataManager? = null
    private var logger: Logger = Logger.getLogger("IncomingPaymentEventListener");

    @EventListener
    open fun onIncomingNonCashPaymentChangedBeforeCommit(event: EntityChangedEvent<IncomingNonCashPayment>) {
        var cal = Calendar.getInstance()
        when (event.type) {
            EntityChangedEvent.Type.CREATED -> {
                var incomeLedger = dataManager!!.create(IncomeLedger::class.java)
                val incomingPayment: IncomingNonCashPayment = dataManager.load(event.entityId).one();
                cal.timeInMillis = incomingPayment.date.time
                val month = cal.get(Calendar.MONTH)
                val year = cal.get(Calendar.YEAR)
                incomeLedger.build(incomingPayment);
                dataManager.save(incomeLedger)
            }
            EntityChangedEvent.Type.UPDATED -> {
                if (event.changes.hasChanges()) {
                    val incomingPayment: IncomingNonCashPayment = dataManager!!.load(event.entityId).one();
                    var incomeLedger: IncomeLedger = dataManager.load(IncomeLedger::class.java)
                        .condition(PropertyCondition.equal("document", incomingPayment)).one()
                    cal.timeInMillis = incomingPayment.date.time
                    val month = cal.get(Calendar.MONTH)
                    val year = cal.get(Calendar.YEAR)
                    for (key in event.changes.attributes.iterator()) {
                        when (key) {
                            "currency" -> {
                                incomeLedger.currency = incomingPayment.currency
                            }
                            "costCategory" -> {
                                incomeLedger.incomeCategory = incomingPayment.incomeCategory
                            }
                            "project" -> {
                                incomeLedger.project = incomingPayment.project
                            }
                            "date" -> {
                                incomeLedger.date = incomingPayment.date
                            }
                            "parthner" -> {
                                incomeLedger.parthner = incomingPayment.parthner
                            }
                            "amount" -> {
                                incomeLedger.amount = incomingPayment.amount
                                var newAmount = incomingPayment.amount
                                var oldAmount: BigDecimal = event.changes.getOldValue("amount")!!
                            }
                        }
                    }
                    dataManager.save(incomeLedger)
                }
            }
            EntityChangedEvent.Type.DELETED -> {
            }
        }
    }
}