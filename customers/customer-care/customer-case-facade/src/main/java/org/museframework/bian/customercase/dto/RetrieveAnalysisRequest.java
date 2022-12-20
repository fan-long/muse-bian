package org.museframework.bian.customercase.dto;

public class RetrieveAnalysisRequest {
    private String customercaseid;

    private String analysisid;

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
}