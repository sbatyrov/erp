package com.batyrov.erp.screen.qna.questionnaire

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.qna.Questionnaire

@UiController("erp_Questionnaire.edit")
@UiDescriptor("questionnaire-edit.xml")
@EditedEntityContainer("questionnaireDc")
class QuestionnaireEdit : StandardEditor<Questionnaire>()