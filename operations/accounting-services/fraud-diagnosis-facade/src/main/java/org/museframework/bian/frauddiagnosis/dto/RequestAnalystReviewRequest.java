package org.museframework.bian.frauddiagnosis.dto;

public class RequestAnalystReviewRequest {
    private String frauddiagnosisid;

    private String analystreviewid;

    private org.museframework.bian.frauddiagnosis.dto.bq.AnalystReview analystReview;

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

    public void setAnalystReview(org.museframework.bian.frauddiagnosis.dto.bq.AnalystReview analystReview) {
        this.analystReview = analystReview;
    }

    public org.museframework.bian.frauddiagnosis.dto.bq.AnalystReview getAnalystReview() {
        return analystReview;
    }
}