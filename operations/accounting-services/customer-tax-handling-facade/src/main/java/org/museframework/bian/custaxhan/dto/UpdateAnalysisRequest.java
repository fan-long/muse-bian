package org.museframework.bian.custaxhan.dto;

public class UpdateAnalysisRequest {
    private String customertaxhandlingid;

    private String analysisid;

    private org.museframework.bian.custaxhan.dto.bq.Analysis analysis;

    public void setCustomertaxhandlingid(String customertaxhandlingid) {
        this.customertaxhandlingid = customertaxhandlingid;
    }

    public String getCustomertaxhandlingid() {
        return customertaxhandlingid;
    }

    public void setAnalysisid(String analysisid) {
        this.analysisid = analysisid;
    }

    public String getAnalysisid() {
        return analysisid;
    }

    public void setAnalysis(org.museframework.bian.custaxhan.dto.bq.Analysis analysis) {
        this.analysis = analysis;
    }

    public org.museframework.bian.custaxhan.dto.bq.Analysis getAnalysis() {
        return analysis;
    }
}