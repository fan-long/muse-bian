package org.museframework.bian.customerportfolio.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdatePerformanceAnalysisResponse {
    @MetaField(ref=true)
    private org.museframework.bian.customerportfolio.dto.bq.PerformanceAnalysis performanceAnalysis;

    public void setPerformanceAnalysis(org.museframework.bian.customerportfolio.dto.bq.PerformanceAnalysis performanceAnalysis) {
        this.performanceAnalysis = performanceAnalysis;
    }

    public org.museframework.bian.customerportfolio.dto.bq.PerformanceAnalysis getPerformanceAnalysis() {
        return performanceAnalysis;
    }
}