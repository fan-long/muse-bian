package org.museframework.bian.delacchan.dto;

public class RetrieveAssessmentResponse {
    private org.museframework.bian.delacchan.dto.bq.Assessment assessment;

    public void setAssessment(org.museframework.bian.delacchan.dto.bq.Assessment assessment) {
        this.assessment = assessment;
    }

    public org.museframework.bian.delacchan.dto.bq.Assessment getAssessment() {
        return assessment;
    }
}