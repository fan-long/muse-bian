package org.museframework.bian.guidelinecompliance.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class EvaluateGuidelineComplianceAssessmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.guidelinecompliance.dto.cr.GuidelineComplianceAssessment guidelineComplianceAssessment;

    public void setGuidelineComplianceAssessment(org.museframework.bian.guidelinecompliance.dto.cr.GuidelineComplianceAssessment guidelineComplianceAssessment) {
        this.guidelineComplianceAssessment = guidelineComplianceAssessment;
    }

    public org.museframework.bian.guidelinecompliance.dto.cr.GuidelineComplianceAssessment getGuidelineComplianceAssessment() {
        return guidelineComplianceAssessment;
    }
}