package org.museframework.bian.mutfunadm.dto;

public class UpdateFundTaxAdministrationRoutineResponse {
    private org.museframework.bian.mutfunadm.dto.bq.FundTaxAdministrationRoutine fundTaxAdministrationRoutine;

    public void setFundTaxAdministrationRoutine(org.museframework.bian.mutfunadm.dto.bq.FundTaxAdministrationRoutine fundTaxAdministrationRoutine) {
        this.fundTaxAdministrationRoutine = fundTaxAdministrationRoutine;
    }

    public org.museframework.bian.mutfunadm.dto.bq.FundTaxAdministrationRoutine getFundTaxAdministrationRoutine() {
        return fundTaxAdministrationRoutine;
    }
}