package org.museframework.bian.hedfunadm.dto;

public class GrantFundManagementRoutineRequest {
    private String hedgefundadministrationid;

    private String fundmanagementroutineid;

    private org.museframework.bian.hedfunadm.dto.bq.FundManagementRoutine fundManagementRoutine;

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

    public void setFundManagementRoutine(org.museframework.bian.hedfunadm.dto.bq.FundManagementRoutine fundManagementRoutine) {
        this.fundManagementRoutine = fundManagementRoutine;
    }

    public org.museframework.bian.hedfunadm.dto.bq.FundManagementRoutine getFundManagementRoutine() {
        return fundManagementRoutine;
    }
}