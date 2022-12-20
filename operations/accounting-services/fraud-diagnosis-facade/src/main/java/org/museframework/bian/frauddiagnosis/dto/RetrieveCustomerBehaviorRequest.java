package org.museframework.bian.frauddiagnosis.dto;

public class RetrieveCustomerBehaviorRequest {
    private String frauddiagnosisid;

    private String customerbehaviorid;

    public void setFrauddiagnosisid(String frauddiagnosisid) {
        this.frauddiagnosisid = frauddiagnosisid;
    }

    public String getFrauddiagnosisid() {
        return frauddiagnosisid;
    }

    public void setCustomerbehaviorid(String customerbehaviorid) {
        this.customerbehaviorid = customerbehaviorid;
    }

    public String getCustomerbehaviorid() {
        return customerbehaviorid;
    }
}