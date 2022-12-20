package org.museframework.bian.parlifman.dto;

public class UpdatePrecedentsRequest {
    private String partylifecyclemanagementid;

    private String precedentsid;

    private org.museframework.bian.parlifman.dto.bq.Precedents precedents;

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

    public void setPrecedents(org.museframework.bian.parlifman.dto.bq.Precedents precedents) {
        this.precedents = precedents;
    }

    public org.museframework.bian.parlifman.dto.bq.Precedents getPrecedents() {
        return precedents;
    }
}