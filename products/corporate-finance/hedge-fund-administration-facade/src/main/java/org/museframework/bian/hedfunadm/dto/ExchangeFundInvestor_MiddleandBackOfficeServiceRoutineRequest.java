package org.museframework.bian.hedfunadm.dto;

public class ExchangeFundInvestor_MiddleandBackOfficeServiceRoutineRequest {
    private String hedgefundadministrationid;

    private String fundinvestor_middleandbackofficeserviceroutineid;

    private org.museframework.bian.hedfunadm.dto.bq.FundInvestor_MiddleandBackOfficeServiceRoutine fundInvestor_MiddleandBackOfficeServiceRoutine;

    public void setHedgefundadministrationid(String hedgefundadministrationid) {
        this.hedgefundadministrationid = hedgefundadministrationid;
    }

    public String getHedgefundadministrationid() {
        return hedgefundadministrationid;
    }

    public void setFundinvestor_middleandbackofficeserviceroutineid(String fundinvestor_middleandbackofficeserviceroutineid) {
        this.fundinvestor_middleandbackofficeserviceroutineid = fundinvestor_middleandbackofficeserviceroutineid;
    }

    public String getFundinvestor_middleandbackofficeserviceroutineid() {
        return fundinvestor_middleandbackofficeserviceroutineid;
    }

    public void setFundInvestor_MiddleandBackOfficeServiceRoutine(org.museframework.bian.hedfunadm.dto.bq.FundInvestor_MiddleandBackOfficeServiceRoutine fundInvestor_MiddleandBackOfficeServiceRoutine) {
        this.fundInvestor_MiddleandBackOfficeServiceRoutine = fundInvestor_MiddleandBackOfficeServiceRoutine;
    }

    public org.museframework.bian.hedfunadm.dto.bq.FundInvestor_MiddleandBackOfficeServiceRoutine getFundInvestor_MiddleandBackOfficeServiceRoutine() {
        return fundInvestor_MiddleandBackOfficeServiceRoutine;
    }
}