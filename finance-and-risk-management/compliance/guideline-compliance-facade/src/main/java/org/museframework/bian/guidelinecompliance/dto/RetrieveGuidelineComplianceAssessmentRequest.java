package org.museframework.bian.guidelinecompliance.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveGuidelineComplianceAssessmentRequest {
    @MetaField
    private String guidelinecomplianceid;

    public void setGuidelinecomplianceid(String guidelinecomplianceid) {
        this.guidelinecomplianceid = guidelinecomplianceid;
    }

    public String getGuidelinecomplianceid() {
        return guidelinecomplianceid;
    }
}