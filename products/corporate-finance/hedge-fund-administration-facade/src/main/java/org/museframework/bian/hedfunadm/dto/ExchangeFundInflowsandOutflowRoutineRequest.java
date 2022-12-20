package org.museframework.bian.hedfunadm.dto;

public class ExchangeFundInflowsandOutflowRoutineRequest {
    private String hedgefundadministrationid;

    private String fundinflowsandoutflowroutineid;

    private org.museframework.bian.hedfunadm.dto.bq.FundInflowsandOutflowRoutine fundInflowsandOutflowRoutine;

    public void setHedgefundadministrationid(String hedgefundadministrationid) {
        this.hedgefundadministrationid = hedgefundadministrationid;
    }

    public String getHedgefundadministrationid() {
        return hedgefundadministrationid;
    }

    public void setFundinflowsandoutflowroutineid(String fundinflowsandoutflowroutineid) {
        this.fundinflowsandoutflowroutineid = fundinflowsandoutflowroutineid;
    }

    public String getFundinflowsandoutflowroutineid() {
        return fundinflowsandoutflowroutineid;
    }

    public void setFundInflowsandOutflowRoutine(org.museframework.bian.hedfunadm.dto.bq.FundInflowsandOutflowRoutine fundInflowsandOutflowRoutine) {
        this.fundInflowsandOutflowRoutine = fundInflowsandOutflowRoutine;
    }

    public org.museframework.bian.hedfunadm.dto.bq.FundInflowsandOutflowRoutine getFundInflowsandOutflowRoutine() {
        return fundInflowsandOutflowRoutine;
    }
}