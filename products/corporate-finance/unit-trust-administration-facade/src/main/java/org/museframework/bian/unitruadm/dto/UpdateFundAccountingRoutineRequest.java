package org.museframework.bian.unitruadm.dto;

public class UpdateFundAccountingRoutineRequest {
    private String unittrustadministrationid;

    private String fundaccountingroutineid;

    private org.museframework.bian.unitruadm.dto.bq.FundAccountingRoutine fundAccountingRoutine;

    public void setUnittrustadministrationid(String unittrustadministrationid) {
        this.unittrustadministrationid = unittrustadministrationid;
    }

    public String getUnittrustadministrationid() {
        return unittrustadministrationid;
    }

    public void setFundaccountingroutineid(String fundaccountingroutineid) {
        this.fundaccountingroutineid = fundaccountingroutineid;
    }

    public String getFundaccountingroutineid() {
        return fundaccountingroutineid;
    }

    public void setFundAccountingRoutine(org.museframework.bian.unitruadm.dto.bq.FundAccountingRoutine fundAccountingRoutine) {
        this.fundAccountingRoutine = fundAccountingRoutine;
    }

    public org.museframework.bian.unitruadm.dto.bq.FundAccountingRoutine getFundAccountingRoutine() {
        return fundAccountingRoutine;
    }
}