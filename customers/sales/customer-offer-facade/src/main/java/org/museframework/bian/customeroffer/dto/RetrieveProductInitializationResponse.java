package org.museframework.bian.customeroffer.dto;

public class RetrieveProductInitializationResponse {
    private org.museframework.bian.customeroffer.dto.bq.ProductInitialization productInitialization;

    public void setProductInitialization(org.museframework.bian.customeroffer.dto.bq.ProductInitialization productInitialization) {
        this.productInitialization = productInitialization;
    }

    public org.museframework.bian.customeroffer.dto.bq.ProductInitialization getProductInitialization() {
        return productInitialization;
    }
}