package org.museframework.bian.productmatching.dto;

public class UpdateProductEligibilityResponse {
    private org.museframework.bian.productmatching.dto.bq.ProductEligibility productEligibility;

    public void setProductEligibility(org.museframework.bian.productmatching.dto.bq.ProductEligibility productEligibility) {
        this.productEligibility = productEligibility;
    }

    public org.museframework.bian.productmatching.dto.bq.ProductEligibility getProductEligibility() {
        return productEligibility;
    }
}