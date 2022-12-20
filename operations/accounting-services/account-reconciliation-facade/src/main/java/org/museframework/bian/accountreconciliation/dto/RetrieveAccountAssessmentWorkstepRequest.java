package org.museframework.bian.accountreconciliation.dto;

public class RetrieveAccountAssessmentWorkstepRequest {
    private String accountreconciliationid;

    private String accountassessmentworkstepid;

    public void setAccountreconciliationid(String accountreconciliationid) {
        this.accountreconciliationid = accountreconciliationid;
    }

    public String getAccountreconciliationid() {
        return accountreconciliationid;
    }

    public void setAccountassessmentworkstepid(String accountassessmentworkstepid) {
        this.accountassessmentworkstepid = accountassessmentworkstepid;
    }

    public String getAccountassessmentworkstepid() {
        return accountassessmentworkstepid;
    }
}