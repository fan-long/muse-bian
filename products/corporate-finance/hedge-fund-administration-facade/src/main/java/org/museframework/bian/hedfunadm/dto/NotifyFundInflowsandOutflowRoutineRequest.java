package org.museframework.bian.hedfunadm.dto;

public class NotifyFundInflowsandOutflowRoutineRequest {
    private String hedgefundadministrationid;

    private String fundinflowsandoutflowroutineid;

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
}