package com.batyrov.erp.listener

import com.batyrov.erp.entity.docs.Document
import com.batyrov.erp.entity.docs.OutcomingCashPayment
import com.batyrov.erp.entity.ledger.ExpensesLedger
import com.batyrov.erp.entity.reference.Parthner
import com.batyrov.erp.service.ParthnerLedgerServiceBean
import io.jmix.core.DataManager
import io.jmix.core.Id
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


@Component("erp_OutcomingCashPaymentEventListener")
open class OutcomingCashPaymentEventListener {

    @Autowired
    private lateinit var parthnerLedgerServiceBean: ParthnerLedgerServiceBean

    @Autowired
    private val dataManager: DataManager? = null
    var logger: Logger = Logger.getLogger("OutcomingCashPaymentEventListener");

    @EventListener
    open fun onOutcomingCashPaymentLoading(event: EntityLoadingEvent<OutcomingCashPayment>) {

    }

    @EventListener
    open fun onOutcomingCashPaymentSaving(event: EntitySavingEvent<OutcomingCashPayment>) {

    }

    @EventListener
    open fun onOutcomingCashPaymentChangedBeforeCommit(event: EntityChangedEvent<OutcomingCashPayment>) {
        var cal = Calendar.getInstance()
        when (event.type) {
            EntityChangedEvent.Type.CREATED -> {
                var expensesLedger = dataManager!!.create(ExpensesLedger::class.java)
                val outcomingCashPayment: OutcomingCashPayment = dataManager.load(event.entityId).one();
                cal.timeInMillis = outcomingCashPayment.date.time
                val month = cal.get(Calendar.MONTH)
                val year = cal.get(Calendar.YEAR)
                expensesLedger.build(outcomingCashPayment);
                dataManager.save(expensesLedger)
                //var parthnerLedger =
                //    parthnerLedgerServiceBean.getOrCreateRecordByDate(month, year, outcomingCashPayment.parthner!!)
                //parthnerLedger.outcome(outcomingCashPayment);
                //dataManager.save(parthnerLedger);
            }
            EntityChangedEvent.Type.UPDATED -> {
                if (event.changes.hasChanges()) {
                    val outcomingCashPayment: OutcomingCashPayment = dataManager!!.load(event.entityId).one();
                    var expensesLedger: ExpensesLedger = dataManager.load(ExpensesLedger::class.java)
                        .condition(PropertyCondition.equal("document", outcomingCashPayment)).one()
                    cal.timeInMillis = outcomingCashPayment.date.time
                    val month = cal.get(Calendar.MONTH)
                    val year = cal.get(Calendar.YEAR)
//                    var parthnerLedger =
//                        parthnerLedgerServiceBean.getOrCreateRecordByDate(month, year, outcomingCashPayment.parthner!!)
                    for (key in event.changes.attributes.iterator()) {
                        when (key) {
                            "currency" -> {
                                expensesLedger.currency = outcomingCashPayment.currency
                            }
                            "costCategory" -> {
                                expensesLedger.costCategory = outcomingCashPayment.costCategory
                            }
                            "costCentre" -> {
                                expensesLedger.costCentre = outcomingCashPayment.costCentre
                            }
                            "project" -> {
                                expensesLedger.project = outcomingCashPayment.project
                            }
                            "date" -> {
                                expensesLedger.date = outcomingCashPayment.date
                            }
                            "parthner" -> {
                                expensesLedger.parthner = outcomingCashPayment.parthner
                            }
                            "amount" -> {
                                expensesLedger.amount = outcomingCashPayment.amount
                                var newAmount = outcomingCashPayment.amount
                                var oldAmount: BigDecimal = event.changes.getOldValue("amount")!!
                                //parthnerLedger.outcomeUpdate(oldAmount, newAmount);
                            }
                        }
                    }
                    dataManager.save(expensesLedger)
                    //dataManager.save(parthnerLedger);
                }
            }
            EntityChangedEvent.Type.DELETED -> {
//                var amount = event.changes.getOldValue<BigDecimal>("amount");
//                var parthnerId : Id<Parthner>? = event.changes.getOldReferenceId<Parthner>("parthner");
//
//                var parthner: Parthner? = dataManager?.load(parthnerId)?.one()
//                var parthnerLedger = parthnerLedgerServiceBean.getOrCreateRecordByDate(
//                    cal.get(Calendar.MONTH), cal.get(
//                        Calendar.YEAR
//                    ), parthner!!
//                )
//                parthnerLedger.outcomeDescrease(amount!!);
//                dataManager?.save(parthnerLedger);
            }
        }
    }

    @TransactionalEventListener
    open fun onOutcomingCashPaymentChangedAfterCommit(event: EntityChangedEvent<OutcomingCashPayment>) {

    }
}