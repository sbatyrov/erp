package com.batyrov.erp.screen.reference.wallet

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.reference.Wallet

@UiController("erp_Wallet.browse")
@UiDescriptor("wallet-browse.xml")
@LookupComponent("walletsTable")
class WalletBrowse : StandardLookup<Wallet>()