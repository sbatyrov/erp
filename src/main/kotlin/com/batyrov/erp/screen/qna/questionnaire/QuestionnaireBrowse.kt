package com.batyrov.erp.screen.qna.questionnaire

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.qna.Questionnaire

@UiController("erp_Questionnaire.browse")
@UiDescriptor("questionnaire-browse.xml")
@LookupComponent("questionnairesTable")
class QuestionnaireBrowse : StandardLookup<Questionnaire>()