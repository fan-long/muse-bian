package org.museframework.bian.hedfunadm.dto;

public class ExchangeFundTaxAdministrationRoutineRequest {
    private String hedgefundadministrationid;

    private String fundtaxadministrationroutineid;

    private org.museframework.bian.hedfunadm.dto.bq.FundTaxAdministrationRoutine fundTaxAdministrationRoutine;

    public void setHedgefundadministrationid(String hedgefundadministrationid) {
        this.hedgefundadministrationid = hedgefundadministrationid;
    }

    public String getHedgefundadministrationid() {
        return hedgefundadministrationid;
    }

    public void setFundtaxadministrationroutineid(String fundtaxadministrationroutineid) {
        this.fundtaxadministrationroutineid = fundtaxadministrationroutineid;
    }

    public String getFundtaxadministrationroutineid() {
        return fundtaxadministrationroutineid;
    }

    public void setFundTaxAdministrationRoutine(org.museframework.bian.hedfunadm.dto.bq.FundTaxAdministrationRoutine fundTaxAdministrationRoutine) {
        this.fundTaxAdministrationRoutine = fundTaxAdministrationRoutine;
    }

    public org.museframework.bian.hedfunadm.dto.bq.FundTaxAdministrationRoutine getFundTaxAdministrationRoutine() {
        return fundTaxAdministrationRoutine;
    }
}