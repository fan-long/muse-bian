package org.museframework.bian.mutfunadm.dto;

public class RequestFundEnrolmentRoutineRequest {
    private String mutualfundadministrationid;

    private String fundenrolmentroutineid;

    private org.museframework.bian.mutfunadm.dto.bq.FundEnrolmentRoutine fundEnrolmentRoutine;

    public void setMutualfundadministrationid(String mutualfundadministrationid) {
        this.mutualfundadministrationid = mutualfundadministrationid;
    }

    public String getMutualfundadministrationid() {
        return mutualfundadministrationid;
    }

    public void setFundenrolmentroutineid(String fundenrolmentroutineid) {
        this.fundenrolmentroutineid = fundenrolmentroutineid;
    }

    public String getFundenrolmentroutineid() {
        return fundenrolmentroutineid;
    }

    public void setFundEnrolmentRoutine(org.museframework.bian.mutfunadm.dto.bq.FundEnrolmentRoutine fundEnrolmentRoutine) {
        this.fundEnrolmentRoutine = fundEnrolmentRoutine;
    }

    public org.museframework.bian.mutfunadm.dto.bq.FundEnrolmentRoutine getFundEnrolmentRoutine() {
        return fundEnrolmentRoutine;
    }
}