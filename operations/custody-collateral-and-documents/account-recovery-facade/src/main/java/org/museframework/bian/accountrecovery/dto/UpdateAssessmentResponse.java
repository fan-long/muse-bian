package org.museframework.bian.accountrecovery.dto;

public class UpdateAssessmentResponse {
    private org.museframework.bian.accountrecovery.dto.bq.Assessment assessment;

    public void setAssessment(org.museframework.bian.accountrecovery.dto.bq.Assessment assessment) {
        this.assessment = assessment;
    }

    public org.museframework.bian.accountrecovery.dto.bq.Assessment getAssessment() {
        return assessment;
    }
}