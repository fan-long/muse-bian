package org.museframework.bian.seractana.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteServicingRootCauseAnalysisRequest {
    @MetaField
    private String servicingactivityanalysisid;

    @MetaField(ref=true)
    private org.museframework.bian.seractana.dto.cr.ServicingRootCauseAnalysis servicingRootCauseAnalysis;

    public void setServicingactivityanalysisid(String servicingactivityanalysisid) {
        this.servicingactivityanalysisid = servicingactivityanalysisid;
    }

    public String getServicingactivityanalysisid() {
        return servicingactivityanalysisid;
    }

    public void setServicingRootCauseAnalysis(org.museframework.bian.seractana.dto.cr.ServicingRootCauseAnalysis servicingRootCauseAnalysis) {
        this.servicingRootCauseAnalysis = servicingRootCauseAnalysis;
    }

    public org.museframework.bian.seractana.dto.cr.ServicingRootCauseAnalysis getServicingRootCauseAnalysis() {
        return servicingRootCauseAnalysis;
    }
}