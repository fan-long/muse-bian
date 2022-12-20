package org.museframework.bian.mutfunadm.dto;

public class UpdateFundFinancialReportingRoutineRequest {
    private String mutualfundadministrationid;

    private String fundfinancialreportingroutineid;

    private org.museframework.bian.mutfunadm.dto.bq.FundFinancialReportingRoutine fundFinancialReportingRoutine;

    public void setMutualfundadministrationid(String mutualfundadministrationid) {
        this.mutualfundadministrationid = mutualfundadministrationid;
    }

    public String getMutualfundadministrationid() {
        return mutualfundadministrationid;
    }

    public void setFundfinancialreportingroutineid(String fundfinancialreportingroutineid) {
        this.fundfinancialreportingroutineid = fundfinancialreportingroutineid;
    }

    public String getFundfinancialreportingroutineid() {
        return fundfinancialreportingroutineid;
    }

    public void setFundFinancialReportingRoutine(org.museframework.bian.mutfunadm.dto.bq.FundFinancialReportingRoutine fundFinancialReportingRoutine) {
        this.fundFinancialReportingRoutine = fundFinancialReportingRoutine;
    }

    public org.museframework.bian.mutfunadm.dto.bq.FundFinancialReportingRoutine getFundFinancialReportingRoutine() {
        return fundFinancialReportingRoutine;
    }
}