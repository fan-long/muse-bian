package org.museframework.bian.accountreconciliation.dto;

public class RetrieveAccountResolutionWorkstepRequest {
    private String accountreconciliationid;

    private String accountresolutionworkstepid;

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
}