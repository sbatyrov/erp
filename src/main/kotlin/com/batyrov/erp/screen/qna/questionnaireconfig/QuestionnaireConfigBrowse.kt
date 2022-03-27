package com.batyrov.erp.screen.qna.questionnaireconfig

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.qna.QuestionnaireConfig

@UiController("erp_QuestionnaireConfig.browse")
@UiDescriptor("questionnaire-config-browse.xml")
@LookupComponent("questionnaireConfigsTable")
class QuestionnaireConfigBrowse : StandardLookup<QuestionnaireConfig>()