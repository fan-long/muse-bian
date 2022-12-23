package org.museframework.bian.customercase.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveAnalysisResponse {
    @MetaField(ref=true)
    private org.museframework.bian.customercase.dto.bq.Analysis analysis;

    public void setAnalysis(org.museframework.bian.customercase.dto.bq.Analysis analysis) {
        this.analysis = analysis;
    }

    public org.museframework.bian.customercase.dto.bq.Analysis getAnalysis() {
        return analysis;
    }
}