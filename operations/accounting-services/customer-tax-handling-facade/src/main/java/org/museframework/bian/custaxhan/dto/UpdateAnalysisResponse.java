package org.museframework.bian.custaxhan.dto;

public class UpdateAnalysisResponse {
    private org.museframework.bian.custaxhan.dto.bq.Analysis analysis;

    public void setAnalysis(org.museframework.bian.custaxhan.dto.bq.Analysis analysis) {
        this.analysis = analysis;
    }

    public org.museframework.bian.custaxhan.dto.bq.Analysis getAnalysis() {
        return analysis;
    }
}