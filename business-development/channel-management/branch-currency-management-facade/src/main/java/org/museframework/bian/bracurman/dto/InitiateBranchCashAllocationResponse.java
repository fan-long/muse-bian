package org.museframework.bian.bracurman.dto;

public class InitiateBranchCashAllocationResponse {
    private org.museframework.bian.bracurman.dto.cr.BranchCashAllocation branchCashAllocation;

    public void setBranchCashAllocation(org.museframework.bian.bracurman.dto.cr.BranchCashAllocation branchCashAllocation) {
        this.branchCashAllocation = branchCashAllocation;
    }

    public org.museframework.bian.bracurman.dto.cr.BranchCashAllocation getBranchCashAllocation() {
        return branchCashAllocation;
    }
}