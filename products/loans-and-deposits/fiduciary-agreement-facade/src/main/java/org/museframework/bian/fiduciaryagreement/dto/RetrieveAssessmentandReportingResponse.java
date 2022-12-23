package org.museframework.bian.fiduciaryagreement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveAssessmentandReportingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.fiduciaryagreement.dto.bq.AssessmentandReporting assessmentandReporting;

    public void setAssessmentandReporting(org.museframework.bian.fiduciaryagreement.dto.bq.AssessmentandReporting assessmentandReporting) {
        this.assessmentandReporting = assessmentandReporting;
    }

    public org.museframework.bian.fiduciaryagreement.dto.bq.AssessmentandReporting getAssessmentandReporting() {
        return assessmentandReporting;
    }
}