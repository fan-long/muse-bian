package org.museframework.bian.accountreconciliation.dto;

public class UpdateAccountAssessmentWorkstepRequest {
    private String accountreconciliationid;

    private String accountassessmentworkstepid;

    private org.museframework.bian.accountreconciliation.dto.bq.AccountAssessmentWorkstep accountAssessmentWorkstep;

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

    public void setAccountAssessmentWorkstep(org.museframework.bian.accountreconciliation.dto.bq.AccountAssessmentWorkstep accountAssessmentWorkstep) {
        this.accountAssessmentWorkstep = accountAssessmentWorkstep;
    }

    public org.museframework.bian.accountreconciliation.dto.bq.AccountAssessmentWorkstep getAccountAssessmentWorkstep() {
        return accountAssessmentWorkstep;
    }
}