package org.museframework.bian.brokeredproduct.dto;

public class ControlBrokeredProductManagementPlanResponse {
    private org.museframework.bian.brokeredproduct.dto.cr.BrokeredProductManagementPlan brokeredProductManagementPlan;

    public void setBrokeredProductManagementPlan(org.museframework.bian.brokeredproduct.dto.cr.BrokeredProductManagementPlan brokeredProductManagementPlan) {
        this.brokeredProductManagementPlan = brokeredProductManagementPlan;
    }

    public org.museframework.bian.brokeredproduct.dto.cr.BrokeredProductManagementPlan getBrokeredProductManagementPlan() {
        return brokeredProductManagementPlan;
    }
}