package org.museframework.bian.brokeredproduct.dto;

public class GrantBrokeredProductManagementPlanRequest {
    private String brokeredproductid;

    private org.museframework.bian.brokeredproduct.dto.cr.BrokeredProductManagementPlan brokeredProductManagementPlan;

    public void setBrokeredproductid(String brokeredproductid) {
        this.brokeredproductid = brokeredproductid;
    }

    public String getBrokeredproductid() {
        return brokeredproductid;
    }

    public void setBrokeredProductManagementPlan(org.museframework.bian.brokeredproduct.dto.cr.BrokeredProductManagementPlan brokeredProductManagementPlan) {
        this.brokeredProductManagementPlan = brokeredProductManagementPlan;
    }

    public org.museframework.bian.brokeredproduct.dto.cr.BrokeredProductManagementPlan getBrokeredProductManagementPlan() {
        return brokeredProductManagementPlan;
    }
}