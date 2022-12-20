package org.museframework.bian.accountrecovery.dto;

public class RetrieveAssessmentRequest {
    private String accountrecoveryid;

    private String assessmentid;

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
}