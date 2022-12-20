package org.museframework.bian.accountrecovery.dto;

public class UpdateAssessmentRequest {
    private String accountrecoveryid;

    private String assessmentid;

    private org.museframework.bian.accountrecovery.dto.bq.Assessment assessment;

    public void setAccountrecoveryid(String accountrecoveryid) {
        this.accountrecoveryid = accountrecoveryid;
    }

    public String getAccountrecoveryid() {
        return accountrecoveryid;
    }

    public void setAssessmentid(String assessmentid) {
        this.assessmentid = assessmentid;
    }

    public String getAssessmentid() {
        return assessmentid;
    }

    public void setAssessment(org.museframework.bian.accountrecovery.dto.bq.Assessment assessment) {
        this.assessment = assessment;
    }

    public org.museframework.bian.accountrecovery.dto.bq.Assessment getAssessment() {
        return assessment;
    }
}