package org.museframework.bian.mutfunadm.dto;

public class RequestFundFinancialReportingRoutineResponse {
    private org.museframework.bian.mutfunadm.dto.bq.FundFinancialReportingRoutine fundFinancialReportingRoutine;

    public void setFundFinancialReportingRoutine(org.museframework.bian.mutfunadm.dto.bq.FundFinancialReportingRoutine fundFinancialReportingRoutine) {
        this.fundFinancialReportingRoutine = fundFinancialReportingRoutine;
    }

    public org.museframework.bian.mutfunadm.dto.bq.FundFinancialReportingRoutine getFundFinancialReportingRoutine() {
        return fundFinancialReportingRoutine;
    }
}