package org.museframework.bian.hedfunadm.dto;

public class NotifyFundDevelopmentRoutineRequest {
    private String hedgefundadministrationid;

    private String funddevelopmentroutineid;

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
}