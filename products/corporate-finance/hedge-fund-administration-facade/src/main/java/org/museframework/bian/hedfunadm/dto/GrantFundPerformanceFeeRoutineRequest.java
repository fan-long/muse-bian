package org.museframework.bian.hedfunadm.dto;

public class GrantFundPerformanceFeeRoutineRequest {
    private String hedgefundadministrationid;

    private String fundperformancefeeroutineid;

    private org.museframework.bian.hedfunadm.dto.bq.FundPerformanceFeeRoutine fundPerformanceFeeRoutine;

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

    public void setFundPerformanceFeeRoutine(org.museframework.bian.hedfunadm.dto.bq.FundPerformanceFeeRoutine fundPerformanceFeeRoutine) {
        this.fundPerformanceFeeRoutine = fundPerformanceFeeRoutine;
    }

    public org.museframework.bian.hedfunadm.dto.bq.FundPerformanceFeeRoutine getFundPerformanceFeeRoutine() {
        return fundPerformanceFeeRoutine;
    }
}