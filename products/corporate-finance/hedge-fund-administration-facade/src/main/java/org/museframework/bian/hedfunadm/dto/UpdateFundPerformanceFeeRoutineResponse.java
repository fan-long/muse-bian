package org.museframework.bian.hedfunadm.dto;

public class UpdateFundPerformanceFeeRoutineResponse {
    private org.museframework.bian.hedfunadm.dto.bq.FundPerformanceFeeRoutine fundPerformanceFeeRoutine;

    public void setFundPerformanceFeeRoutine(org.museframework.bian.hedfunadm.dto.bq.FundPerformanceFeeRoutine fundPerformanceFeeRoutine) {
        this.fundPerformanceFeeRoutine = fundPerformanceFeeRoutine;
    }

    public org.museframework.bian.hedfunadm.dto.bq.FundPerformanceFeeRoutine getFundPerformanceFeeRoutine() {
        return fundPerformanceFeeRoutine;
    }
}