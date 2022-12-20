package org.museframework.bian.hedfunadm.dto;

public class GrantFundDevelopmentRoutineRequest {
    private String hedgefundadministrationid;

    private String funddevelopmentroutineid;

    private org.museframework.bian.hedfunadm.dto.bq.FundDevelopmentRoutine fundDevelopmentRoutine;

    public void setHedgefundadministrationid(String hedgefundadministrationid) {
        this.hedgefundadministrationid = hedgefundadministrationid;
    }

    public String getHedgefundadministrationid() {
        return hedgefundadministrationid;
    }

    public void setFunddevelopmentroutineid(String funddevelopmentroutineid) {
        this.funddevelopmentroutineid = funddevelopmentroutineid;
    }

    public String getFunddevelopmentroutineid() {
        return funddevelopmentroutineid;
    }

    public void setFundDevelopmentRoutine(org.museframework.bian.hedfunadm.dto.bq.FundDevelopmentRoutine fundDevelopmentRoutine) {
        this.fundDevelopmentRoutine = fundDevelopmentRoutine;
    }

    public org.museframework.bian.hedfunadm.dto.bq.FundDevelopmentRoutine getFundDevelopmentRoutine() {
        return fundDevelopmentRoutine;
    }
}