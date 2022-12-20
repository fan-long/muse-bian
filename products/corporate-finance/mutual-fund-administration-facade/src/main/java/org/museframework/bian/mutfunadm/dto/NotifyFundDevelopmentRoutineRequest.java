package org.museframework.bian.mutfunadm.dto;

public class NotifyFundDevelopmentRoutineRequest {
    private String mutualfundadministrationid;

    private String funddevelopmentroutineid;

    public void setMutualfundadministrationid(String mutualfundadministrationid) {
        this.mutualfundadministrationid = mutualfundadministrationid;
    }

    public String getMutualfundadministrationid() {
        return mutualfundadministrationid;
    }

    public void setFunddevelopmentroutineid(String funddevelopmentroutineid) {
        this.funddevelopmentroutineid = funddevelopmentroutineid;
    }

    public String getFunddevelopmentroutineid() {
        return funddevelopmentroutineid;
    }
}