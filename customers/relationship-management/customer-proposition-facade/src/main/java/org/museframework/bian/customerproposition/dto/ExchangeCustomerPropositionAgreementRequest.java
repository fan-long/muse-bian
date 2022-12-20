package org.museframework.bian.customerproposition.dto;

public class ExchangeCustomerPropositionAgreementRequest {
    private String customerpropositionid;

    private org.museframework.bian.customerproposition.dto.cr.CustomerPropositionAgreement customerPropositionAgreement;

    public void setCustomerpropositionid(String customerpropositionid) {
        this.customerpropositionid = customerpropositionid;
    }

    public String getCustomerpropositionid() {
        return customerpropositionid;
    }

    public void setCustomerPropositionAgreement(org.museframework.bian.customerproposition.dto.cr.CustomerPropositionAgreement customerPropositionAgreement) {
        this.customerPropositionAgreement = customerPropositionAgreement;
    }

    public org.museframework.bian.customerproposition.dto.cr.CustomerPropositionAgreement getCustomerPropositionAgreement() {
        return customerPropositionAgreement;
    }
}