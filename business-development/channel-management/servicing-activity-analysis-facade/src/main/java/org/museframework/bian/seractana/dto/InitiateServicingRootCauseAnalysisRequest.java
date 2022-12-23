package org.museframework.bian.seractana.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateServicingRootCauseAnalysisRequest {
    @MetaField(ref=true)
    private org.museframework.bian.seractana.dto.cr.ServicingRootCauseAnalysis servicingRootCauseAnalysis;

    public void setServicingRootCauseAnalysis(org.museframework.bian.seractana.dto.cr.ServicingRootCauseAnalysis servicingRootCauseAnalysis) {
        this.servicingRootCauseAnalysis = servicingRootCauseAnalysis;
    }

    public org.museframework.bian.seractana.dto.cr.ServicingRootCauseAnalysis getServicingRootCauseAnalysis() {
        return servicingRootCauseAnalysis;
    }
}