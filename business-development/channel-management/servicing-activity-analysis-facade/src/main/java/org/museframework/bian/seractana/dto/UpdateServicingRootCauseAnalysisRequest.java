package org.museframework.bian.seractana.dto;

public class UpdateServicingRootCauseAnalysisRequest {
    private String servicingactivityanalysisid;

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