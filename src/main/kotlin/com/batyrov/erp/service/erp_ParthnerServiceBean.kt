package com.batyrov.erp.service

import com.batyrov.erp.entity.reference.Parthner
import io.jmix.core.DataManager
import io.jmix.core.querycondition.PropertyCondition
import liquibase.pro.packaged.id
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.util.*


@Component("erp_ParthnerServiceBean")
class ParthnerServiceBean {

    @Autowired
    private lateinit var dataManager: DataManager

//     fun getParthnerById(id: UUID) : Parthner {
//        return dataManager.load(Parthner::class.java).condition(PropertyCondition.equal("id", id)).one()
//     }

}