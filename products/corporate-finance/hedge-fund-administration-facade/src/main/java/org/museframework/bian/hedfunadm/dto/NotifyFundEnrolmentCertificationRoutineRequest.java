package org.museframework.bian.hedfunadm.dto;

public class NotifyFundEnrolmentCertificationRoutineRequest {
    private String hedgefundadministrationid;

    private String fundenrolmentcertificationroutineid;

    public void setHedgefundadministrationid(String hedgefundadministrationid) {
        this.hedgefundadministrationid = hedgefundadministrationid;
    }

    public String getHedgefundadministrationid() {
        return hedgefundadministrationid;
    }

    public void setFundenrolmentcertificationroutineid(String fundenrolmentcertificationroutineid) {
        this.fundenrolmentcertificationroutineid = fundenrolmentcertificationroutineid;
    }

    public String getFundenrolmentcertificationroutineid() {
        return fundenrolmentcertificationroutineid;
    }
}