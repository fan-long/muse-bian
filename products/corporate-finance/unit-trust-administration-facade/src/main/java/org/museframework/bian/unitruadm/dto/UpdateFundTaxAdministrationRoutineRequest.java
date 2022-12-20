package org.museframework.bian.unitruadm.dto;

public class UpdateFundTaxAdministrationRoutineRequest {
    private String unittrustadministrationid;

    private String fundtaxadministrationroutineid;

    private org.museframework.bian.unitruadm.dto.bq.FundTaxAdministrationRoutine fundTaxAdministrationRoutine;

    public void setUnittrustadministrationid(String unittrustadministrationid) {
        this.unittrustadministrationid = unittrustadministrationid;
    }

    public String getUnittrustadministrationid() {
        return unittrustadministrationid;
    }

    public void setFundtaxadministrationroutineid(String fundtaxadministrationroutineid) {
        this.fundtaxadministrationroutineid = fundtaxadministrationroutineid;
    }

    public String getFundtaxadministrationroutineid() {
        return fundtaxadministrationroutineid;
    }

    public void setFundTaxAdministrationRoutine(org.museframework.bian.unitruadm.dto.bq.FundTaxAdministrationRoutine fundTaxAdministrationRoutine) {
        this.fundTaxAdministrationRoutine = fundTaxAdministrationRoutine;
    }

    public org.museframework.bian.unitruadm.dto.bq.FundTaxAdministrationRoutine getFundTaxAdministrationRoutine() {
        return fundTaxAdministrationRoutine;
    }
}