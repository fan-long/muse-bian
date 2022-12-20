package org.museframework.bian.productmatching.dto;

public class UpdateProductEligibilityRequest {
    private String productmatchingid;

    private String producteligibilityid;

    private org.museframework.bian.productmatching.dto.bq.ProductEligibility productEligibility;

    public void setProductmatchingid(String productmatchingid) {
        this.productmatchingid = productmatchingid;
    }

    public String getProductmatchingid() {
        return productmatchingid;
    }

    public void setProducteligibilityid(String producteligibilityid) {
        this.producteligibilityid = producteligibilityid;
    }

    public String getProducteligibilityid() {
        return producteligibilityid;
    }

    public void setProductEligibility(org.museframework.bian.productmatching.dto.bq.ProductEligibility productEligibility) {
        this.productEligibility = productEligibility;
    }

    public org.museframework.bian.productmatching.dto.bq.ProductEligibility getProductEligibility() {
        return productEligibility;
    }
}