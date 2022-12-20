package org.museframework.bian.unitruadm.dto;

public class ExchangeFundManagementFeeRoutineRequest {
    private String unittrustadministrationid;

    private String fundmanagementfeeroutineid;

    private org.museframework.bian.unitruadm.dto.bq.FundManagementFeeRoutine fundManagementFeeRoutine;

    public void setUnittrustadministrationid(String unittrustadministrationid) {
        this.unittrustadministrationid = unittrustadministrationid;
    }

    public String getUnittrustadministrationid() {
        return unittrustadministrationid;
    }

    public void setFundmanagementfeeroutineid(String fundmanagementfeeroutineid) {
        this.fundmanagementfeeroutineid = fundmanagementfeeroutineid;
    }

    public String getFundmanagementfeeroutineid() {
        return fundmanagementfeeroutineid;
    }

    public void setFundManagementFeeRoutine(org.museframework.bian.unitruadm.dto.bq.FundManagementFeeRoutine fundManagementFeeRoutine) {
        this.fundManagementFeeRoutine = fundManagementFeeRoutine;
    }

    public org.museframework.bian.unitruadm.dto.bq.FundManagementFeeRoutine getFundManagementFeeRoutine() {
        return fundManagementFeeRoutine;
    }
}