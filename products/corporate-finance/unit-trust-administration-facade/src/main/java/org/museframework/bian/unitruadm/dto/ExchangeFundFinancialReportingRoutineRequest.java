package org.museframework.bian.unitruadm.dto;

public class ExchangeFundFinancialReportingRoutineRequest {
    private String unittrustadministrationid;

    private String fundfinancialreportingroutineid;

    private org.museframework.bian.unitruadm.dto.bq.FundFinancialReportingRoutine fundFinancialReportingRoutine;

    public void setUnittrustadministrationid(String unittrustadministrationid) {
        this.unittrustadministrationid = unittrustadministrationid;
    }

    public String getUnittrustadministrationid() {
        return unittrustadministrationid;
    }

    public void setFundfinancialreportingroutineid(String fundfinancialreportingroutineid) {
        this.fundfinancialreportingroutineid = fundfinancialreportingroutineid;
    }

    public String getFundfinancialreportingroutineid() {
        return fundfinancialreportingroutineid;
    }

    public void setFundFinancialReportingRoutine(org.museframework.bian.unitruadm.dto.bq.FundFinancialReportingRoutine fundFinancialReportingRoutine) {
        this.fundFinancialReportingRoutine = fundFinancialReportingRoutine;
    }

    public org.museframework.bian.unitruadm.dto.bq.FundFinancialReportingRoutine getFundFinancialReportingRoutine() {
        return fundFinancialReportingRoutine;
    }
}