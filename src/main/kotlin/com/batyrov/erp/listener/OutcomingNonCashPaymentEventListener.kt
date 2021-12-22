package com.batyrov.erp.listener

import com.batyrov.erp.entity.docs.OutcomingCashPayment
import com.batyrov.erp.entity.docs.OutcomingNonCashPayment
import com.batyrov.erp.entity.ledger.ExpensesLedger
import io.jmix.core.DataManager
import io.jmix.core.event.EntityChangedEvent
import io.jmix.core.querycondition.PropertyCondition
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component
import java.math.BigDecimal
import java.util.*
import java.util.logging.Logger

@Component("erp_OutcomingNonCashPaymentEventListener")
open class OutcomingNonCashPaymentEventListener {
    @Autowired
    private val dataManager: DataManager? = null
    var logger: Logger = Logger.getLogger("OutcomingNonCashPaymentEventListener");

    @EventListener
    open fun onOutcomingNonCashPaymentChangedBeforeCommit(event: EntityChangedEvent<OutcomingNonCashPayment>) {
        var cal = Calendar.getInstance()
        when (event.type) {
            EntityChangedEvent.Type.CREATED -> {
                var expensesLedger = dataManager!!.create(ExpensesLedger::class.java)
                val outcomingNonCashPayment: OutcomingNonCashPayment = dataManager.load(event.entityId).one();
                cal.timeInMillis = outcomingNonCashPayment.date.time
                val month = cal.get(Calendar.MONTH)
                val year = cal.get(Calendar.YEAR)
                expensesLedger.build(outcomingNonCashPayment);
                dataManager.save(expensesLedger)
            }
            EntityChangedEvent.Type.UPDATED -> {
                if (event.changes.hasChanges()) {
                    val outcomingNonCashPayment: OutcomingNonCashPayment = dataManager!!.load(event.entityId).one();
                    var expensesLedger: ExpensesLedger = dataManager.load(ExpensesLedger::class.java)
                        .condition(PropertyCondition.equal("document", outcomingNonCashPayment)).one()
                    cal.timeInMillis = outcomingNonCashPayment.date.time
                    val month = cal.get(Calendar.MONTH)
                    val year = cal.get(Calendar.YEAR)
                    for (key in event.changes.attributes.iterator()) {
                        when (key) {
                            "currency" -> {
                                expensesLedger.currency = outcomingNonCashPayment.currency
                            }
                            "costCategory" -> {
                                expensesLedger.costCategory = outcomingNonCashPayment.costCategory
                            }
                            "costCentre" -> {
                                expensesLedger.costCentre = outcomingNonCashPayment.costCentre
                            }
                            "project" -> {
                                expensesLedger.project = outcomingNonCashPayment.project
                            }
                            "date" -> {
                                expensesLedger.date = outcomingNonCashPayment.date
                            }
                            "parthner" -> {
                                expensesLedger.parthner = outcomingNonCashPayment.parthner
                            }
                            "amount" -> {
                                expensesLedger.amount = outcomingNonCashPayment.amount
                                var newAmount = outcomingNonCashPayment.amount
                                var oldAmount: BigDecimal = event.changes.getOldValue("amount")!!
                            }
                        }
                    }
                    dataManager.save(expensesLedger)
                }
            }
            EntityChangedEvent.Type.DELETED -> {
            }
        }
    }
}


