package org.museframework.bian.frauddiagnosis.dto;

public class RetrieveAnalystReviewRequest {
    private String frauddiagnosisid;

    private String analystreviewid;

    public void setFrauddiagnosisid(String frauddiagnosisid) {
        this.frauddiagnosisid = frauddiagnosisid;
    }

    public String getFrauddiagnosisid() {
        return frauddiagnosisid;
    }

    public void setAnalystreviewid(String analystreviewid) {
        this.analystreviewid = analystreviewid;
    }

    public String getAnalystreviewid() {
        return analystreviewid;
    }
}