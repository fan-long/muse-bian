package org.museframework.bian.delacchan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveAssessmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.delacchan.dto.bq.Assessment assessment;

    public void setAssessment(org.museframework.bian.delacchan.dto.bq.Assessment assessment) {
        this.assessment = assessment;
    }

    public org.museframework.bian.delacchan.dto.bq.Assessment getAssessment() {
        return assessment;
    }
}