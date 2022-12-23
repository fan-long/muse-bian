package org.museframework.bian.underwriting.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveUnderwritingAssessmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.underwriting.dto.cr.UnderwritingAssessment underwritingAssessment;

    public void setUnderwritingAssessment(org.museframework.bian.underwriting.dto.cr.UnderwritingAssessment underwritingAssessment) {
        this.underwritingAssessment = underwritingAssessment;
    }

    public org.museframework.bian.underwriting.dto.cr.UnderwritingAssessment getUnderwritingAssessment() {
        return underwritingAssessment;
    }
}