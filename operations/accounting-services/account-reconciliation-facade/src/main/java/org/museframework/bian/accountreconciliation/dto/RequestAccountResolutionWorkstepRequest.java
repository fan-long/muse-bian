package org.museframework.bian.accountreconciliation.dto;

public class RequestAccountResolutionWorkstepRequest {
    private String accountreconciliationid;

    private String accountresolutionworkstepid;

    private org.museframework.bian.accountreconciliation.dto.bq.AccountResolutionWorkstep accountResolutionWorkstep;

    public void setAccountreconciliationid(String accountreconciliationid) {
        this.accountreconciliationid = accountreconciliationid;
    }

    public String getAccountreconciliationid() {
        return accountreconciliationid;
    }

    public void setAccountresolutionworkstepid(String accountresolutionworkstepid) {
        this.accountresolutionworkstepid = accountresolutionworkstepid;
    }

    public String getAccountresolutionworkstepid() {
        return accountresolutionworkstepid;
    }

    public void setAccountResolutionWorkstep(org.museframework.bian.accountreconciliation.dto.bq.AccountResolutionWorkstep accountResolutionWorkstep) {
        this.accountResolutionWorkstep = accountResolutionWorkstep;
    }

    public org.museframework.bian.accountreconciliation.dto.bq.AccountResolutionWorkstep getAccountResolutionWorkstep() {
        return accountResolutionWorkstep;
    }
}