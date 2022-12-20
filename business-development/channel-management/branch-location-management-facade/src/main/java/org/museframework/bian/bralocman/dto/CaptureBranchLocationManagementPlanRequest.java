package org.museframework.bian.bralocman.dto;

public class CaptureBranchLocationManagementPlanRequest {
    private String branchlocationmanagementid;

    private org.museframework.bian.bralocman.dto.cr.BranchLocationManagementPlan branchLocationManagementPlan;

    public void setBranchlocationmanagementid(String branchlocationmanagementid) {
        this.branchlocationmanagementid = branchlocationmanagementid;
    }

    public String getBranchlocationmanagementid() {
        return branchlocationmanagementid;
    }

    public void setBranchLocationManagementPlan(org.museframework.bian.bralocman.dto.cr.BranchLocationManagementPlan branchLocationManagementPlan) {
        this.branchLocationManagementPlan = branchLocationManagementPlan;
    }

    public org.museframework.bian.bralocman.dto.cr.BranchLocationManagementPlan getBranchLocationManagementPlan() {
        return branchLocationManagementPlan;
    }
}