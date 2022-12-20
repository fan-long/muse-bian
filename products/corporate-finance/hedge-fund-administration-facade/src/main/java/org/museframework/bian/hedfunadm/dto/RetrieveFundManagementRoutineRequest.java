package org.museframework.bian.hedfunadm.dto;

public class RetrieveFundManagementRoutineRequest {
    private String hedgefundadministrationid;

    private String fundmanagementroutineid;

    public void setHedgefundadministrationid(String hedgefundadministrationid) {
        this.hedgefundadministrationid = hedgefundadministrationid;
    }

    public String getHedgefundadministrationid() {
        return hedgefundadministrationid;
    }

    public void setFundmanagementroutineid(String fundmanagementroutineid) {
        this.fundmanagementroutineid = fundmanagementroutineid;
    }

    public String getFundmanagementroutineid() {
        return fundmanagementroutineid;
    }
}