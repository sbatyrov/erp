package com.batyrov.erp.service

import com.batyrov.erp.entity.ledger.ParthnerLedger
import com.batyrov.erp.entity.reference.Parthner
import io.jmix.core.DataManager
import io.jmix.core.LoadContext
import io.jmix.core.entity.KeyValueEntity
import io.jmix.core.querycondition.LogicalCondition
import io.jmix.core.querycondition.PropertyCondition
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.math.BigDecimal

@Component("erp_ParthnerLedgerServiceBean")
class ParthnerLedgerServiceBean {

    @Autowired
    private lateinit var dataManager: DataManager


    fun getOrCreateRecordByDate(month: Int, year: Int, parthner: Parthner): ParthnerLedger {
        var parthnerLedger: ParthnerLedger = dataManager.load(ParthnerLedger::class.java).condition(
            LogicalCondition.and(
                PropertyCondition.equal("month", month),
                PropertyCondition.equal("year", year),
                PropertyCondition.equal("parthner", parthner)
            )
        ).optional().orElse(dataManager.create(ParthnerLedger::class.java))
        parthnerLedger.parthner = parthner
        parthnerLedger.month = month
        parthnerLedger.year = year
        parthnerLedger.startBalance = BigDecimal(0)
        parthnerLedger.endBalance = BigDecimal(0)
        parthnerLedger.income = BigDecimal(0)
        parthnerLedger.outcome = BigDecimal(0)
        dataManager.save(parthnerLedger)
        return parthnerLedger
    }

}