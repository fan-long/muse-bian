package org.museframework.bian.unitruadm.dto;

public class ExchangeFundManagementFeeRoutineResponse {
    private org.museframework.bian.unitruadm.dto.bq.FundManagementFeeRoutine fundManagementFeeRoutine;

    public void setFundManagementFeeRoutine(org.museframework.bian.unitruadm.dto.bq.FundManagementFeeRoutine fundManagementFeeRoutine) {
        this.fundManagementFeeRoutine = fundManagementFeeRoutine;
    }

    public org.museframework.bian.unitruadm.dto.bq.FundManagementFeeRoutine getFundManagementFeeRoutine() {
        return fundManagementFeeRoutine;
    }
}