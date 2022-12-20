package org.museframework.bian.hedfunadm.dto;

public class RequestFundEnrolmentCertificationRoutineRequest {
    private String hedgefundadministrationid;

    private String fundenrolmentcertificationroutineid;

    private org.museframework.bian.hedfunadm.dto.bq.FundEnrolmentCertificationRoutine fundEnrolmentCertificationRoutine;

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

    public void setFundEnrolmentCertificationRoutine(org.museframework.bian.hedfunadm.dto.bq.FundEnrolmentCertificationRoutine fundEnrolmentCertificationRoutine) {
        this.fundEnrolmentCertificationRoutine = fundEnrolmentCertificationRoutine;
    }

    public org.museframework.bian.hedfunadm.dto.bq.FundEnrolmentCertificationRoutine getFundEnrolmentCertificationRoutine() {
        return fundEnrolmentCertificationRoutine;
    }
}