package org.museframework.bian.hedfunadm.dto;

public class UpdateFundFinancialReportingRoutineResponse {
    private org.museframework.bian.hedfunadm.dto.bq.FundFinancialReportingRoutine fundFinancialReportingRoutine;

    public void setFundFinancialReportingRoutine(org.museframework.bian.hedfunadm.dto.bq.FundFinancialReportingRoutine fundFinancialReportingRoutine) {
        this.fundFinancialReportingRoutine = fundFinancialReportingRoutine;
    }

    public org.museframework.bian.hedfunadm.dto.bq.FundFinancialReportingRoutine getFundFinancialReportingRoutine() {
        return fundFinancialReportingRoutine;
    }
}