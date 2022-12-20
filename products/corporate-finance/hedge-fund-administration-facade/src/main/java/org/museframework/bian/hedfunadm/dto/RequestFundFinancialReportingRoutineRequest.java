package org.museframework.bian.hedfunadm.dto;

public class RequestFundFinancialReportingRoutineRequest {
    private String hedgefundadministrationid;

    private String fundfinancialreportingroutineid;

    private org.museframework.bian.hedfunadm.dto.bq.FundFinancialReportingRoutine fundFinancialReportingRoutine;

    public void setHedgefundadministrationid(String hedgefundadministrationid) {
        this.hedgefundadministrationid = hedgefundadministrationid;
    }

    public String getHedgefundadministrationid() {
        return hedgefundadministrationid;
    }

    public void setFundfinancialreportingroutineid(String fundfinancialreportingroutineid) {
        this.fundfinancialreportingroutineid = fundfinancialreportingroutineid;
    }

    public String getFundfinancialreportingroutineid() {
        return fundfinancialreportingroutineid;
    }

    public void setFundFinancialReportingRoutine(org.museframework.bian.hedfunadm.dto.bq.FundFinancialReportingRoutine fundFinancialReportingRoutine) {
        this.fundFinancialReportingRoutine = fundFinancialReportingRoutine;
    }

    public org.museframework.bian.hedfunadm.dto.bq.FundFinancialReportingRoutine getFundFinancialReportingRoutine() {
        return fundFinancialReportingRoutine;
    }
}