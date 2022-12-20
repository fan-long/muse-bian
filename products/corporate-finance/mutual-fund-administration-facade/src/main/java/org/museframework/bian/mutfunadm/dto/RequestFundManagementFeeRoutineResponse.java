package org.museframework.bian.mutfunadm.dto;

public class RequestFundManagementFeeRoutineResponse {
    private org.museframework.bian.mutfunadm.dto.bq.FundManagementFeeRoutine fundManagementFeeRoutine;

    public void setFundManagementFeeRoutine(org.museframework.bian.mutfunadm.dto.bq.FundManagementFeeRoutine fundManagementFeeRoutine) {
        this.fundManagementFeeRoutine = fundManagementFeeRoutine;
    }

    public org.museframework.bian.mutfunadm.dto.bq.FundManagementFeeRoutine getFundManagementFeeRoutine() {
        return fundManagementFeeRoutine;
    }
}