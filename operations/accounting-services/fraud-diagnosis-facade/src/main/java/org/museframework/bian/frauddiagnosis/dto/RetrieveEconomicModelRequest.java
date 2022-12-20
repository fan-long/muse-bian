package org.museframework.bian.frauddiagnosis.dto;

public class RetrieveEconomicModelRequest {
    private String frauddiagnosisid;

    private String economicmodelid;

    public void setFrauddiagnosisid(String frauddiagnosisid) {
        this.frauddiagnosisid = frauddiagnosisid;
    }

    public String getFrauddiagnosisid() {
        return frauddiagnosisid;
    }

    public void setEconomicmodelid(String economicmodelid) {
        this.economicmodelid = economicmodelid;
    }

    public String getEconomicmodelid() {
        return economicmodelid;
    }
}