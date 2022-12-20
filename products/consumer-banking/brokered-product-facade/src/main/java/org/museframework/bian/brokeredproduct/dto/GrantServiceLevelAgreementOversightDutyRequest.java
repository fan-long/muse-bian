package org.museframework.bian.brokeredproduct.dto;

public class GrantServiceLevelAgreementOversightDutyRequest {
    private String brokeredproductid;

    private String servicelevelagreementoversightdutyid;

    private org.museframework.bian.brokeredproduct.dto.bq.ServiceLevelAgreementOversightDuty serviceLevelAgreementOversightDuty;

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

    public void setServiceLevelAgreementOversightDuty(org.museframework.bian.brokeredproduct.dto.bq.ServiceLevelAgreementOversightDuty serviceLevelAgreementOversightDuty) {
        this.serviceLevelAgreementOversightDuty = serviceLevelAgreementOversightDuty;
    }

    public org.museframework.bian.brokeredproduct.dto.bq.ServiceLevelAgreementOversightDuty getServiceLevelAgreementOversightDuty() {
        return serviceLevelAgreementOversightDuty;
    }
}