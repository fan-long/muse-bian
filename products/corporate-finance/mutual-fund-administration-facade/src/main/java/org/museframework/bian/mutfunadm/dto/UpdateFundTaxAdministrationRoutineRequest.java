package org.museframework.bian.mutfunadm.dto;

public class UpdateFundTaxAdministrationRoutineRequest {
    private String mutualfundadministrationid;

    private String fundtaxadministrationroutineid;

    private org.museframework.bian.mutfunadm.dto.bq.FundTaxAdministrationRoutine fundTaxAdministrationRoutine;

    public void setMutualfundadministrationid(String mutualfundadministrationid) {
        this.mutualfundadministrationid = mutualfundadministrationid;
    }

    public String getMutualfundadministrationid() {
        return mutualfundadministrationid;
    }

    public void setFundtaxadministrationroutineid(String fundtaxadministrationroutineid) {
        this.fundtaxadministrationroutineid = fundtaxadministrationroutineid;
    }

    public String getFundtaxadministrationroutineid() {
        return fundtaxadministrationroutineid;
    }

    public void setFundTaxAdministrationRoutine(org.museframework.bian.mutfunadm.dto.bq.FundTaxAdministrationRoutine fundTaxAdministrationRoutine) {
        this.fundTaxAdministrationRoutine = fundTaxAdministrationRoutine;
    }

    public org.museframework.bian.mutfunadm.dto.bq.FundTaxAdministrationRoutine getFundTaxAdministrationRoutine() {
        return fundTaxAdministrationRoutine;
    }
}