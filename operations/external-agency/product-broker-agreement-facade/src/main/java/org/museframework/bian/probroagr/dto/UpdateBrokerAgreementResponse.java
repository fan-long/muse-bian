package org.museframework.bian.probroagr.dto;

public class UpdateBrokerAgreementResponse {
    private org.museframework.bian.probroagr.dto.cr.BrokerAgreement brokerAgreement;

    public void setBrokerAgreement(org.museframework.bian.probroagr.dto.cr.BrokerAgreement brokerAgreement) {
        this.brokerAgreement = brokerAgreement;
    }

    public org.museframework.bian.probroagr.dto.cr.BrokerAgreement getBrokerAgreement() {
        return brokerAgreement;
    }
}