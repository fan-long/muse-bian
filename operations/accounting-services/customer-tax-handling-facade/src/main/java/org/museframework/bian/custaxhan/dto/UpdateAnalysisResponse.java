package org.museframework.bian.custaxhan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateAnalysisResponse {
    @MetaField(ref=true)
    private org.museframework.bian.custaxhan.dto.bq.Analysis analysis;

    public void setAnalysis(org.museframework.bian.custaxhan.dto.bq.Analysis analysis) {
        this.analysis = analysis;
    }

    public org.museframework.bian.custaxhan.dto.bq.Analysis getAnalysis() {
        return analysis;
    }
}