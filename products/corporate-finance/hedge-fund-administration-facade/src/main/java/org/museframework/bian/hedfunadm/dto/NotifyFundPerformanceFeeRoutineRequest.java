package org.museframework.bian.hedfunadm.dto;

public class NotifyFundPerformanceFeeRoutineRequest {
    private String hedgefundadministrationid;

    private String fundperformancefeeroutineid;

    public void setHedgefundadministrationid(String hedgefundadministrationid) {
        this.hedgefundadministrationid = hedgefundadministrationid;
    }

    public String getHedgefundadministrationid() {
        return hedgefundadministrationid;
    }

    public void setFundperformancefeeroutineid(String fundperformancefeeroutineid) {
        this.fundperformancefeeroutineid = fundperformancefeeroutineid;
    }

    public String getFundperformancefeeroutineid() {
        return fundperformancefeeroutineid;
    }
}