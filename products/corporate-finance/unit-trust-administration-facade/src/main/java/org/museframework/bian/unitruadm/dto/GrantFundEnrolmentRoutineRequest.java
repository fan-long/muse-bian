package org.museframework.bian.unitruadm.dto;

public class GrantFundEnrolmentRoutineRequest {
    private String unittrustadministrationid;

    private String fundenrolmentroutineid;

    private org.museframework.bian.unitruadm.dto.bq.FundEnrolmentRoutine fundEnrolmentRoutine;

    public void setUnittrustadministrationid(String unittrustadministrationid) {
        this.unittrustadministrationid = unittrustadministrationid;
    }

    public String getUnittrustadministrationid() {
        return unittrustadministrationid;
    }

    public void setFundenrolmentroutineid(String fundenrolmentroutineid) {
        this.fundenrolmentroutineid = fundenrolmentroutineid;
    }

    public String getFundenrolmentroutineid() {
        return fundenrolmentroutineid;
    }

    public void setFundEnrolmentRoutine(org.museframework.bian.unitruadm.dto.bq.FundEnrolmentRoutine fundEnrolmentRoutine) {
        this.fundEnrolmentRoutine = fundEnrolmentRoutine;
    }

    public org.museframework.bian.unitruadm.dto.bq.FundEnrolmentRoutine getFundEnrolmentRoutine() {
        return fundEnrolmentRoutine;
    }
}