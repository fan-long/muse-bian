package org.museframework.bian.positionmanagement.dto;

public class UpdateFinancialPositionStateRequest {
    private String positionmanagementid;

    private org.museframework.bian.positionmanagement.dto.cr.FinancialPositionState financialPositionState;

    public void setPositionmanagementid(String positionmanagementid) {
        this.positionmanagementid = positionmanagementid;
    }

    public String getPositionmanagementid() {
        return positionmanagementid;
    }

    public void setFinancialPositionState(org.museframework.bian.positionmanagement.dto.cr.FinancialPositionState financialPositionState) {
        this.financialPositionState = financialPositionState;
    }

    public org.museframework.bian.positionmanagement.dto.cr.FinancialPositionState getFinancialPositionState() {
        return financialPositionState;
    }
}