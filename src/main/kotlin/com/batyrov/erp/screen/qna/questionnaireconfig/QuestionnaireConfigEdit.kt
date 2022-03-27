package com.batyrov.erp.screen.qna.questionnaireconfig

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.qna.QuestionnaireConfig

@UiController("erp_QuestionnaireConfig.edit")
@UiDescriptor("questionnaire-config-edit.xml")
@EditedEntityContainer("questionnaireConfigDc")
class QuestionnaireConfigEdit : StandardEditor<QuestionnaireConfig>()