package org.museframework.bian.bracurman.dto;

public class CaptureBranchCashAllocationRequest {
    private String branchcurrencymanagementid;

    private org.museframework.bian.bracurman.dto.cr.BranchCashAllocation branchCashAllocation;

    public void setBranchcurrencymanagementid(String branchcurrencymanagementid) {
        this.branchcurrencymanagementid = branchcurrencymanagementid;
    }

    public String getBranchcurrencymanagementid() {
        return branchcurrencymanagementid;
    }

    public void setBranchCashAllocation(org.museframework.bian.bracurman.dto.cr.BranchCashAllocation branchCashAllocation) {
        this.branchCashAllocation = branchCashAllocation;
    }

    public org.museframework.bian.bracurman.dto.cr.BranchCashAllocation getBranchCashAllocation() {
        return branchCashAllocation;
    }
}