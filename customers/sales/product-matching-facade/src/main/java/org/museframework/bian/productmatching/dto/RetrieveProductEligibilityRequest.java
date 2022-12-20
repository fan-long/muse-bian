package org.museframework.bian.productmatching.dto;

public class RetrieveProductEligibilityRequest {
    private String productmatchingid;

    private String producteligibilityid;

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
}