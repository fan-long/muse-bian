package org.museframework.bian.hedfunadm.dto;

public class RetrieveFundTaxAdministrationRoutineResponse {
    private org.museframework.bian.hedfunadm.dto.bq.FundTaxAdministrationRoutine fundTaxAdministrationRoutine;

    public void setFundTaxAdministrationRoutine(org.museframework.bian.hedfunadm.dto.bq.FundTaxAdministrationRoutine fundTaxAdministrationRoutine) {
        this.fundTaxAdministrationRoutine = fundTaxAdministrationRoutine;
    }

    public org.museframework.bian.hedfunadm.dto.bq.FundTaxAdministrationRoutine getFundTaxAdministrationRoutine() {
        return fundTaxAdministrationRoutine;
    }
}