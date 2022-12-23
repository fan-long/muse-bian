package org.museframework.bian.procamman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdatePerformanceAssessmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.procamman.dto.bq.PerformanceAssessment performanceAssessment;

    public void setPerformanceAssessment(org.museframework.bian.procamman.dto.bq.PerformanceAssessment performanceAssessment) {
        this.performanceAssessment = performanceAssessment;
    }

    public org.museframework.bian.procamman.dto.bq.PerformanceAssessment getPerformanceAssessment() {
        return performanceAssessment;
    }
}