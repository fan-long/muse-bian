package org.museframework.bian.mutfunadm.dto;

public class RetrieveFundManagementFeeRoutineRequest {
    private String mutualfundadministrationid;

    private String fundmanagementfeeroutineid;

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
}