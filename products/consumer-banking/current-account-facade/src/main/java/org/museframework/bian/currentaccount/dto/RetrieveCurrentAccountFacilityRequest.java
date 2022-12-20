package org.museframework.bian.currentaccount.dto;

public class RetrieveCurrentAccountFacilityRequest {
    private String currentaccountid;

    public void setCurrentaccountid(String currentaccountid) {
        this.currentaccountid = currentaccountid;
    }

    public String getCurrentaccountid() {
        return currentaccountid;
    }
}