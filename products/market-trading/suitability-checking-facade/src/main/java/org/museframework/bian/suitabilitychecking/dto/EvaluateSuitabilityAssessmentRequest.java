package org.museframework.bian.suitabilitychecking.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class EvaluateSuitabilityAssessmentRequest {
    @MetaField(ref=true)
    private org.museframework.bian.suitabilitychecking.dto.cr.SuitabilityAssessment suitabilityAssessment;

    public void setSuitabilityAssessment(org.museframework.bian.suitabilitychecking.dto.cr.SuitabilityAssessment suitabilityAssessment) {
        this.suitabilityAssessment = suitabilityAssessment;
    }

    public org.museframework.bian.suitabilitychecking.dto.cr.SuitabilityAssessment getSuitabilityAssessment() {
        return suitabilityAssessment;
    }
}