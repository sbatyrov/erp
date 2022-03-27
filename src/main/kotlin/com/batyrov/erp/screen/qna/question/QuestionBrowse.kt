package com.batyrov.erp.screen.qna.question

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.qna.Question

@UiController("erp_Question.browse")
@UiDescriptor("question-browse.xml")
@LookupComponent("questionsTable")
class QuestionBrowse : StandardLookup<Question>()