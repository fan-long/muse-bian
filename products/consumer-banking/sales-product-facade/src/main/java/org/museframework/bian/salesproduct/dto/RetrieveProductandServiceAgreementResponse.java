package org.museframework.bian.salesproduct.dto;

public class RetrieveProductandServiceAgreementResponse {
    private org.museframework.bian.salesproduct.dto.cr.ProductandServiceAgreement productandServiceAgreement;

    public void setProductandServiceAgreement(org.museframework.bian.salesproduct.dto.cr.ProductandServiceAgreement productandServiceAgreement) {
        this.productandServiceAgreement = productandServiceAgreement;
    }

    public org.museframework.bian.salesproduct.dto.cr.ProductandServiceAgreement getProductandServiceAgreement() {
        return productandServiceAgreement;
    }
}