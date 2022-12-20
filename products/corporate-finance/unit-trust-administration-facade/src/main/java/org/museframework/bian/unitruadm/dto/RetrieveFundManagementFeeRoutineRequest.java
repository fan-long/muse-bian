package org.museframework.bian.unitruadm.dto;

public class RetrieveFundManagementFeeRoutineRequest {
    private String unittrustadministrationid;

    private String fundmanagementfeeroutineid;

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
}