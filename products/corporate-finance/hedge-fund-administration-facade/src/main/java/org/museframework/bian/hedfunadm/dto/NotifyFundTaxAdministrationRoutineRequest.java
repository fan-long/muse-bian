package org.museframework.bian.hedfunadm.dto;

public class NotifyFundTaxAdministrationRoutineRequest {
    private String hedgefundadministrationid;

    private String fundtaxadministrationroutineid;

    public void setHedgefundadministrationid(String hedgefundadministrationid) {
        this.hedgefundadministrationid = hedgefundadministrationid;
    }

    public String getHedgefundadministrationid() {
        return hedgefundadministrationid;
    }

    public void setFundtaxadministrationroutineid(String fundtaxadministrationroutineid) {
        this.fundtaxadministrationroutineid = fundtaxadministrationroutineid;
    }

    public String getFundtaxadministrationroutineid() {
        return fundtaxadministrationroutineid;
    }
}