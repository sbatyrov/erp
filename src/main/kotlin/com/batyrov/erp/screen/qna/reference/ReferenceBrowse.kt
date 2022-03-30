package com.batyrov.erp.screen.qna.reference

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.qna.Reference

@UiController("erp_Reference.browse")
@UiDescriptor("reference-browse.xml")
@LookupComponent("referencesTable")
class ReferenceBrowse : StandardLookup<Reference>()