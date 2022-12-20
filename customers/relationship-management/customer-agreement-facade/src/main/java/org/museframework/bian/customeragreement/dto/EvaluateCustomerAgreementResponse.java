package org.museframework.bian.customeragreement.dto;

public class EvaluateCustomerAgreementResponse {
    private org.museframework.bian.customeragreement.dto.cr.CustomerAgreement customerAgreement;

    public void setCustomerAgreement(org.museframework.bian.customeragreement.dto.cr.CustomerAgreement customerAgreement) {
        this.customerAgreement = customerAgreement;
    }

    public org.museframework.bian.customeragreement.dto.cr.CustomerAgreement getCustomerAgreement() {
        return customerAgreement;
    }
}