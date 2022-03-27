package com.batyrov.erp.screen.qna.question

import io.jmix.ui.screen.*
import com.batyrov.erp.entity.qna.Question

@UiController("erp_Question.edit")
@UiDescriptor("question-edit.xml")
@EditedEntityContainer("questionDc")
class QuestionEdit : StandardEditor<Question>()