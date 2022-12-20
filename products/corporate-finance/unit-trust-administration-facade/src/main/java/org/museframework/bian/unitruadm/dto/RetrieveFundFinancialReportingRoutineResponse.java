package org.museframework.bian.unitruadm.dto;

public class RetrieveFundFinancialReportingRoutineResponse {
    private org.museframework.bian.unitruadm.dto.bq.FundFinancialReportingRoutine fundFinancialReportingRoutine;

    public void setFundFinancialReportingRoutine(org.museframework.bian.unitruadm.dto.bq.FundFinancialReportingRoutine fundFinancialReportingRoutine) {
        this.fundFinancialReportingRoutine = fundFinancialReportingRoutine;
    }

    public org.museframework.bian.unitruadm.dto.bq.FundFinancialReportingRoutine getFundFinancialReportingRoutine() {
        return fundFinancialReportingRoutine;
    }
}