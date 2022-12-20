package org.museframework.bian.partyauthentication.dto;

public class RetrieveBehaviorRequest {
    private String partyauthenticationid;

    private String behaviorid;

    public void setPartyauthenticationid(String partyauthenticationid) {
        this.partyauthenticationid = partyauthenticationid;
    }

    public String getPartyauthenticationid() {
        return partyauthenticationid;
    }

    public void setBehaviorid(String behaviorid) {
        this.behaviorid = behaviorid;
    }

    public String getBehaviorid() {
        return behaviorid;
    }
}