package org.museframework.bian.customerworkbench.dto;

public class RetrieveProductandServiceAccessResponse {
    private org.museframework.bian.customerworkbench.dto.bq.ProductandServiceAccess productandServiceAccess;

    public void setProductandServiceAccess(org.museframework.bian.customerworkbench.dto.bq.ProductandServiceAccess productandServiceAccess) {
        this.productandServiceAccess = productandServiceAccess;
    }

    public org.museframework.bian.customerworkbench.dto.bq.ProductandServiceAccess getProductandServiceAccess() {
        return productandServiceAccess;
    }
}