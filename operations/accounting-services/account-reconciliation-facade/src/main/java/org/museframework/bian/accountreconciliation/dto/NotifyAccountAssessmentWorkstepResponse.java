package org.museframework.bian.accountreconciliation.dto;

public class NotifyAccountAssessmentWorkstepResponse {
    private org.museframework.bian.accountreconciliation.dto.bq.AccountAssessmentWorkstep accountAssessmentWorkstep;

    public void setAccountAssessmentWorkstep(org.museframework.bian.accountreconciliation.dto.bq.AccountAssessmentWorkstep accountAssessmentWorkstep) {
        this.accountAssessmentWorkstep = accountAssessmentWorkstep;
    }

    public org.museframework.bian.accountreconciliation.dto.bq.AccountAssessmentWorkstep getAccountAssessmentWorkstep() {
        return accountAssessmentWorkstep;
    }
}