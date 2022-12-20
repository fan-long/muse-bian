package org.museframework.bian.conadvser.dto;

public class RetrieveProductGuidanceResponse {
    private org.museframework.bian.conadvser.dto.bq.ProductGuidance productGuidance;

    public void setProductGuidance(org.museframework.bian.conadvser.dto.bq.ProductGuidance productGuidance) {
        this.productGuidance = productGuidance;
    }

    public org.museframework.bian.conadvser.dto.bq.ProductGuidance getProductGuidance() {
        return productGuidance;
    }
}