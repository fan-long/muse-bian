package org.museframework.bian.mutfunadm.dto;

public class NotifyFundAccountingRoutineResponse {
    private org.museframework.bian.mutfunadm.dto.bq.FundAccountingRoutine fundAccountingRoutine;

    public void setFundAccountingRoutine(org.museframework.bian.mutfunadm.dto.bq.FundAccountingRoutine fundAccountingRoutine) {
        this.fundAccountingRoutine = fundAccountingRoutine;
    }

    public org.museframework.bian.mutfunadm.dto.bq.FundAccountingRoutine getFundAccountingRoutine() {
        return fundAccountingRoutine;
    }
}