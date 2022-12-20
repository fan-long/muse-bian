package org.museframework.bian.hedfunadm.dto;

public class RequestFundAccountingRoutineRequest {
    private String hedgefundadministrationid;

    private String fundaccountingroutineid;

    private org.museframework.bian.hedfunadm.dto.bq.FundAccountingRoutine fundAccountingRoutine;

    public void setHedgefundadministrationid(String hedgefundadministrationid) {
        this.hedgefundadministrationid = hedgefundadministrationid;
    }

    public String getHedgefundadministrationid() {
        return hedgefundadministrationid;
    }

    public void setFundaccountingroutineid(String fundaccountingroutineid) {
        this.fundaccountingroutineid = fundaccountingroutineid;
    }

    public String getFundaccountingroutineid() {
        return fundaccountingroutineid;
    }

    public void setFundAccountingRoutine(org.museframework.bian.hedfunadm.dto.bq.FundAccountingRoutine fundAccountingRoutine) {
        this.fundAccountingRoutine = fundAccountingRoutine;
    }

    public org.museframework.bian.hedfunadm.dto.bq.FundAccountingRoutine getFundAccountingRoutine() {
        return fundAccountingRoutine;
    }
}