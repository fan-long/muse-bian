package org.museframework.bian.mutfunadm.dto;

public class RequestFundAccountingRoutineRequest {
    private String mutualfundadministrationid;

    private String fundaccountingroutineid;

    private org.museframework.bian.mutfunadm.dto.bq.FundAccountingRoutine fundAccountingRoutine;

    public void setMutualfundadministrationid(String mutualfundadministrationid) {
        this.mutualfundadministrationid = mutualfundadministrationid;
    }

    public String getMutualfundadministrationid() {
        return mutualfundadministrationid;
    }

    public void setFundaccountingroutineid(String fundaccountingroutineid) {
        this.fundaccountingroutineid = fundaccountingroutineid;
    }

    public String getFundaccountingroutineid() {
        return fundaccountingroutineid;
    }

    public void setFundAccountingRoutine(org.museframework.bian.mutfunadm.dto.bq.FundAccountingRoutine fundAccountingRoutine) {
        this.fundAccountingRoutine = fundAccountingRoutine;
    }

    public org.museframework.bian.mutfunadm.dto.bq.FundAccountingRoutine getFundAccountingRoutine() {
        return fundAccountingRoutine;
    }
}