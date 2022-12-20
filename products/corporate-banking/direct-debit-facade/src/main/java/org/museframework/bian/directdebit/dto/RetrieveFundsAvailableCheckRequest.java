package org.museframework.bian.directdebit.dto;

public class RetrieveFundsAvailableCheckRequest {
    private String directdebitid;

    private String fundsavailablecheckid;

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
}