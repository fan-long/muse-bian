package org.museframework.bian.mutfunadm.dto;

public class RequestFundManagementFeeRoutineRequest {
    private String mutualfundadministrationid;

    private String fundmanagementfeeroutineid;

    private org.museframework.bian.mutfunadm.dto.bq.FundManagementFeeRoutine fundManagementFeeRoutine;

    public void setMutualfundadministrationid(String mutualfundadministrationid) {
        this.mutualfundadministrationid = mutualfundadministrationid;
    }

    public String getMutualfundadministrationid() {
        return mutualfundadministrationid;
    }

    public void setFundmanagementfeeroutineid(String fundmanagementfeeroutineid) {
        this.fundmanagementfeeroutineid = fundmanagementfeeroutineid;
    }

    public String getFundmanagementfeeroutineid() {
        return fundmanagementfeeroutineid;
    }

    public void setFundManagementFeeRoutine(org.museframework.bian.mutfunadm.dto.bq.FundManagementFeeRoutine fundManagementFeeRoutine) {
        this.fundManagementFeeRoutine = fundManagementFeeRoutine;
    }

    public org.museframework.bian.mutfunadm.dto.bq.FundManagementFeeRoutine getFundManagementFeeRoutine() {
        return fundManagementFeeRoutine;
    }
}