package org.museframework.bian.bracurman.dto;

public class ExchangeBranchCashAllocationResponse {
    private org.museframework.bian.bracurman.dto.cr.BranchCashAllocation branchCashAllocation;

    public void setBranchCashAllocation(org.museframework.bian.bracurman.dto.cr.BranchCashAllocation branchCashAllocation) {
        this.branchCashAllocation = branchCashAllocation;
    }

    public org.museframework.bian.bracurman.dto.cr.BranchCashAllocation getBranchCashAllocation() {
        return branchCashAllocation;
    }
}