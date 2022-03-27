package com.batyrov.erp.screen.reference.currency

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.reference.Currency

@UiController("erp_Currency.edit")
@UiDescriptor("currency-edit.xml")
@EditedEntityContainer("currencyDc")
class CurrencyEdit : StandardEditor<Currency>()