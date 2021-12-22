package com.batyrov.erp.screen.reference.currency

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.reference.Currency

@UiController("erp_Currency.browse")
@UiDescriptor("currency-browse.xml")
@LookupComponent("currenciesTable")
class CurrencyBrowse : StandardLookup<Currency>()