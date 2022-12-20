package org.museframework.bian.unitruadm.dto;

public class ExchangeFundAccountingRoutineResponse {
    private org.museframework.bian.unitruadm.dto.bq.FundAccountingRoutine fundAccountingRoutine;

    public void setFundAccountingRoutine(org.museframework.bian.unitruadm.dto.bq.FundAccountingRoutine fundAccountingRoutine) {
        this.fundAccountingRoutine = fundAccountingRoutine;
    }

    public org.museframework.bian.unitruadm.dto.bq.FundAccountingRoutine getFundAccountingRoutine() {
        return fundAccountingRoutine;
    }
}