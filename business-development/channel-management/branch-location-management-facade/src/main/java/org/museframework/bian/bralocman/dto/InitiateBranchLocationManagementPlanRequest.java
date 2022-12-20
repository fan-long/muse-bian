package org.museframework.bian.bralocman.dto;

public class InitiateBranchLocationManagementPlanRequest {
    private org.museframework.bian.bralocman.dto.cr.BranchLocationManagementPlan branchLocationManagementPlan;

    public void setBranchLocationManagementPlan(org.museframework.bian.bralocman.dto.cr.BranchLocationManagementPlan branchLocationManagementPlan) {
        this.branchLocationManagementPlan = branchLocationManagementPlan;
    }

    public org.museframework.bian.bralocman.dto.cr.BranchLocationManagementPlan getBranchLocationManagementPlan() {
        return branchLocationManagementPlan;
    }
}