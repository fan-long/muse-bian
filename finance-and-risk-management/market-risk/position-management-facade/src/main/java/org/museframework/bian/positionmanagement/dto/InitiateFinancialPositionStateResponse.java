package org.museframework.bian.positionmanagement.dto;

public class InitiateFinancialPositionStateResponse {
    private org.museframework.bian.positionmanagement.dto.cr.FinancialPositionState financialPositionState;

    public void setFinancialPositionState(org.museframework.bian.positionmanagement.dto.cr.FinancialPositionState financialPositionState) {
        this.financialPositionState = financialPositionState;
    }

    public org.museframework.bian.positionmanagement.dto.cr.FinancialPositionState getFinancialPositionState() {
        return financialPositionState;
    }
}