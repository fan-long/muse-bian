package org.museframework.bian.unitruadm.dto;

public class NotifyFundEnrolmentRoutineRequest {
    private String unittrustadministrationid;

    private String fundenrolmentroutineid;

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
}