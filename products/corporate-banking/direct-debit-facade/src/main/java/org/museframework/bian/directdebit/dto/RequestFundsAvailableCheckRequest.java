package org.museframework.bian.directdebit.dto;

public class RequestFundsAvailableCheckRequest {
    private String directdebitid;

    private String fundsavailablecheckid;

    private org.museframework.bian.directdebit.dto.bq.FundsAvailableCheck fundsAvailableCheck;

    public void setDirectdebitid(String directdebitid) {
        this.directdebitid = directdebitid;
    }

    public String getDirectdebitid() {
        return directdebitid;
    }

    public void setFundsavailablecheckid(String fundsavailablecheckid) {
        this.fundsavailablecheckid = fundsavailablecheckid;
    }

    public String getFundsavailablecheckid() {
        return fundsavailablecheckid;
    }

    public void setFundsAvailableCheck(org.museframework.bian.directdebit.dto.bq.FundsAvailableCheck fundsAvailableCheck) {
        this.fundsAvailableCheck = fundsAvailableCheck;
    }

    public org.museframework.bian.directdebit.dto.bq.FundsAvailableCheck getFundsAvailableCheck() {
        return fundsAvailableCheck;
    }
}