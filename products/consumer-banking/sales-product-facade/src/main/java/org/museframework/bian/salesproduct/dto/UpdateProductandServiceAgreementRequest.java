package org.museframework.bian.salesproduct.dto;

public class UpdateProductandServiceAgreementRequest {
    private String salesproductid;

    private org.museframework.bian.salesproduct.dto.cr.ProductandServiceAgreement productandServiceAgreement;

    public void setSalesproductid(String salesproductid) {
        this.salesproductid = salesproductid;
    }

    public String getSalesproductid() {
        return salesproductid;
    }

    public void setProductandServiceAgreement(org.museframework.bian.salesproduct.dto.cr.ProductandServiceAgreement productandServiceAgreement) {
        this.productandServiceAgreement = productandServiceAgreement;
    }

    public org.museframework.bian.salesproduct.dto.cr.ProductandServiceAgreement getProductandServiceAgreement() {
        return productandServiceAgreement;
    }
}