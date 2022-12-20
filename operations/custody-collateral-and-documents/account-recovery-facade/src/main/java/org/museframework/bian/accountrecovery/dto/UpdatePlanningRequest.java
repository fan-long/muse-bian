package org.museframework.bian.accountrecovery.dto;

public class UpdatePlanningRequest {
    private String accountrecoveryid;

    private String planningid;

    private org.museframework.bian.accountrecovery.dto.bq.Planning planning;

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

    public void setPlanning(org.museframework.bian.accountrecovery.dto.bq.Planning planning) {
        this.planning = planning;
    }

    public org.museframework.bian.accountrecovery.dto.bq.Planning getPlanning() {
        return planning;
    }
}