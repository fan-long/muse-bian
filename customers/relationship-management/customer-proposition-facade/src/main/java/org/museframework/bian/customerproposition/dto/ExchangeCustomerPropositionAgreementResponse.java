package org.museframework.bian.customerproposition.dto;

public class ExchangeCustomerPropositionAgreementResponse {
    private org.museframework.bian.customerproposition.dto.cr.CustomerPropositionAgreement customerPropositionAgreement;

    public void setCustomerPropositionAgreement(org.museframework.bian.customerproposition.dto.cr.CustomerPropositionAgreement customerPropositionAgreement) {
        this.customerPropositionAgreement = customerPropositionAgreement;
    }

    public org.museframework.bian.customerproposition.dto.cr.CustomerPropositionAgreement getCustomerPropositionAgreement() {
        return customerPropositionAgreement;
    }
}