package org.museframework.bian.mutfunadm.dto;

public class UpdateFundDevelopmentRoutineResponse {
    private org.museframework.bian.mutfunadm.dto.bq.FundDevelopmentRoutine fundDevelopmentRoutine;

    public void setFundDevelopmentRoutine(org.museframework.bian.mutfunadm.dto.bq.FundDevelopmentRoutine fundDevelopmentRoutine) {
        this.fundDevelopmentRoutine = fundDevelopmentRoutine;
    }

    public org.museframework.bian.mutfunadm.dto.bq.FundDevelopmentRoutine getFundDevelopmentRoutine() {
        return fundDevelopmentRoutine;
    }
}