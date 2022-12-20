package org.museframework.bian.partyauthentication.dto;

public class EvaluateBehaviorRequest {
    private String partyauthenticationid;

    private String behaviorid;

    private org.museframework.bian.partyauthentication.dto.bq.Behavior behavior;

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

    public void setBehavior(org.museframework.bian.partyauthentication.dto.bq.Behavior behavior) {
        this.behavior = behavior;
    }

    public org.museframework.bian.partyauthentication.dto.bq.Behavior getBehavior() {
        return behavior;
    }
}