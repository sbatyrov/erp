package com.batyrov.erp.screen.qna.referencevalue

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.qna.ReferenceValue

@UiController("erp_ReferenceValue.browse")
@UiDescriptor("reference-value-browse.xml")
@LookupComponent("referenceValuesTable")
class ReferenceValueBrowse : StandardLookup<ReferenceValue>()