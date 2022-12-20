package org.museframework.bian.parlifman.dto;

public class RetrievePrecedentsRequest {
    private String partylifecyclemanagementid;

    private String precedentsid;

    public void setPartylifecyclemanagementid(String partylifecyclemanagementid) {
        this.partylifecyclemanagementid = partylifecyclemanagementid;
    }

    public String getPartylifecyclemanagementid() {
        return partylifecyclemanagementid;
    }

    public void setPrecedentsid(String precedentsid) {
        this.precedentsid = precedentsid;
    }

    public String getPrecedentsid() {
        return precedentsid;
    }
}