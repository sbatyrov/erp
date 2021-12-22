package com.batyrov.erp.screen.reference.warehouse

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.reference.Warehouse

@UiController("erp_Warehouse.browse")
@UiDescriptor("warehouse-browse.xml")
@LookupComponent("warehousesTable")
class WarehouseBrowse : StandardLookup<Warehouse>()