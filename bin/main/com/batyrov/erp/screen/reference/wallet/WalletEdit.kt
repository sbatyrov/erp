package com.batyrov.erp.screen.reference.wallet

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.reference.Wallet

@UiController("erp_Wallet.edit")
@UiDescriptor("wallet-edit.xml")
@EditedEntityContainer("walletDc")
class WalletEdit : StandardEditor<Wallet>()