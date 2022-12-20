package org.museframework.bian.frauddiagnosis.dto;

public class RetrieveEconomicModelResponse {
    private org.museframework.bian.frauddiagnosis.dto.bq.EconomicModel economicModel;

    public void setEconomicModel(org.museframework.bian.frauddiagnosis.dto.bq.EconomicModel economicModel) {
        this.economicModel = economicModel;
    }

    public org.museframework.bian.frauddiagnosis.dto.bq.EconomicModel getEconomicModel() {
        return economicModel;
    }
}