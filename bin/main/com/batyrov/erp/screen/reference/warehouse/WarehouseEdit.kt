package com.batyrov.erp.screen.reference.warehouse

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.reference.Warehouse

@UiController("erp_Warehouse.edit")
@UiDescriptor("warehouse-edit.xml")
@EditedEntityContainer("warehouseDc")
class WarehouseEdit : StandardEditor<Warehouse>()