package org.museframework.bian.mutfunadm.dto;

public class GrantFundDevelopmentRoutineRequest {
    private String mutualfundadministrationid;

    private String funddevelopmentroutineid;

    private org.museframework.bian.mutfunadm.dto.bq.FundDevelopmentRoutine fundDevelopmentRoutine;

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

    public void setFundDevelopmentRoutine(org.museframework.bian.mutfunadm.dto.bq.FundDevelopmentRoutine fundDevelopmentRoutine) {
        this.fundDevelopmentRoutine = fundDevelopmentRoutine;
    }

    public org.museframework.bian.mutfunadm.dto.bq.FundDevelopmentRoutine getFundDevelopmentRoutine() {
        return fundDevelopmentRoutine;
    }
}