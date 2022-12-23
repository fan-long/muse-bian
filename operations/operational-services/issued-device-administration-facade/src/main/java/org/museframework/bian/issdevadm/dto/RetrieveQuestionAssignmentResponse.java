package org.museframework.bian.issdevadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveQuestionAssignmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.issdevadm.dto.bq.QuestionAssignment questionAssignment;

    public void setQuestionAssignment(org.museframework.bian.issdevadm.dto.bq.QuestionAssignment questionAssignment) {
        this.questionAssignment = questionAssignment;
    }

    public org.museframework.bian.issdevadm.dto.bq.QuestionAssignment getQuestionAssignment() {
        return questionAssignment;
    }
}