package org.museframework.bian.bralocope.dto;

public class ExchangeBranchLocationAdministrativePlanRequest {
    private String branchlocationoperationsid;

    private org.museframework.bian.bralocope.dto.cr.BranchLocationAdministrativePlan branchLocationAdministrativePlan;

    public void setBranchlocationoperationsid(String branchlocationoperationsid) {
        this.branchlocationoperationsid = branchlocationoperationsid;
    }

    public String getBranchlocationoperationsid() {
        return branchlocationoperationsid;
    }

    public void setBranchLocationAdministrativePlan(org.museframework.bian.bralocope.dto.cr.BranchLocationAdministrativePlan branchLocationAdministrativePlan) {
        this.branchLocationAdministrativePlan = branchLocationAdministrativePlan;
    }

    public org.museframework.bian.bralocope.dto.cr.BranchLocationAdministrativePlan getBranchLocationAdministrativePlan() {
        return branchLocationAdministrativePlan;
    }
}