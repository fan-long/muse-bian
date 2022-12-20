package org.museframework.bian.frauddiagnosis.dto;

public class RequestAnalystReviewResponse {
    private org.museframework.bian.frauddiagnosis.dto.bq.AnalystReview analystReview;

    public void setAnalystReview(org.museframework.bian.frauddiagnosis.dto.bq.AnalystReview analystReview) {
        this.analystReview = analystReview;
    }

    public org.museframework.bian.frauddiagnosis.dto.bq.AnalystReview getAnalystReview() {
        return analystReview;
    }
}