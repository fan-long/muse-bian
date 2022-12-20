package org.museframework.bian.customercase.dto;

public class RetrieveAnalysisResponse {
    private org.museframework.bian.customercase.dto.bq.Analysis analysis;

    public void setAnalysis(org.museframework.bian.customercase.dto.bq.Analysis analysis) {
        this.analysis = analysis;
    }

    public org.museframework.bian.customercase.dto.bq.Analysis getAnalysis() {
        return analysis;
    }
}