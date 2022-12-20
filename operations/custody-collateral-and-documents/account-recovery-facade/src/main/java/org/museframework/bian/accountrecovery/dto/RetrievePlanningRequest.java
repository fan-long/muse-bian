package org.museframework.bian.accountrecovery.dto;

public class RetrievePlanningRequest {
    private String accountrecoveryid;

    private String planningid;

    public void setAccountrecoveryid(String accountrecoveryid) {
        this.accountrecoveryid = accountrecoveryid;
    }

    public String getAccountrecoveryid() {
        return accountrecoveryid;
    }

    public void setPlanningid(String planningid) {
        this.planningid = planningid;
    }

    public String getPlanningid() {
        return planningid;
    }
}