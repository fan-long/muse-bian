package org.museframework.bian.customercase.dto;

public class UpdateAnalysisRequest {
    private String customercaseid;

    private String analysisid;

    private org.museframework.bian.customercase.dto.bq.Analysis analysis;

    public void setCustomercaseid(String customercaseid) {
        this.customercaseid = customercaseid;
    }

    public String getCustomercaseid() {
        return customercaseid;
    }

    public void setAnalysisid(String analysisid) {
        this.analysisid = analysisid;
    }

    public String getAnalysisid() {
        return analysisid;
    }

    public void setAnalysis(org.museframework.bian.customercase.dto.bq.Analysis analysis) {
        this.analysis = analysis;
    }

    public org.museframework.bian.customercase.dto.bq.Analysis getAnalysis() {
        return analysis;
    }
}