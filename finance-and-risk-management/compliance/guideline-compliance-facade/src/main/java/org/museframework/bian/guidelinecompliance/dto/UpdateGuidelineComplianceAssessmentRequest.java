package org.museframework.bian.guidelinecompliance.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateGuidelineComplianceAssessmentRequest {
    @MetaField
    private String guidelinecomplianceid;

    @MetaField(ref=true)
    private org.museframework.bian.guidelinecompliance.dto.cr.GuidelineComplianceAssessment guidelineComplianceAssessment;

    public void setGuidelinecomplianceid(String guidelinecomplianceid) {
        this.guidelinecomplianceid = guidelinecomplianceid;
    }

    public String getGuidelinecomplianceid() {
        return guidelinecomplianceid;
    }

    public void setGuidelineComplianceAssessment(org.museframework.bian.guidelinecompliance.dto.cr.GuidelineComplianceAssessment guidelineComplianceAssessment) {
        this.guidelineComplianceAssessment = guidelineComplianceAssessment;
    }

    public org.museframework.bian.guidelinecompliance.dto.cr.GuidelineComplianceAssessment getGuidelineComplianceAssessment() {
        return guidelineComplianceAssessment;
    }
}