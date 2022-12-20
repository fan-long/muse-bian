package org.museframework.bian.hedfunadm.dto;

public class RequestFundAccountingRoutineResponse {
    private org.museframework.bian.hedfunadm.dto.bq.FundAccountingRoutine fundAccountingRoutine;

    public void setFundAccountingRoutine(org.museframework.bian.hedfunadm.dto.bq.FundAccountingRoutine fundAccountingRoutine) {
        this.fundAccountingRoutine = fundAccountingRoutine;
    }

    public org.museframework.bian.hedfunadm.dto.bq.FundAccountingRoutine getFundAccountingRoutine() {
        return fundAccountingRoutine;
    }
}