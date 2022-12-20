package org.museframework.bian.brokeredproduct.dto;

public class RetrieveServiceLevelAgreementOversightDutyRequest {
    private String brokeredproductid;

    private String servicelevelagreementoversightdutyid;

    public void setBrokeredproductid(String brokeredproductid) {
        this.brokeredproductid = brokeredproductid;
    }

    public String getBrokeredproductid() {
        return brokeredproductid;
    }

    public void setServicelevelagreementoversightdutyid(String servicelevelagreementoversightdutyid) {
        this.servicelevelagreementoversightdutyid = servicelevelagreementoversightdutyid;
    }

    public String getServicelevelagreementoversightdutyid() {
        return servicelevelagreementoversightdutyid;
    }
}