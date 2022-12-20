package org.museframework.bian.productcombination.dto;

public class ControlProductCombinationFacilityRequest {
    private String productcombinationid;

    private org.museframework.bian.productcombination.dto.cr.ProductCombinationFacility productCombinationFacility;

    public void setProductcombinationid(String productcombinationid) {
        this.productcombinationid = productcombinationid;
    }

    public String getProductcombinationid() {
        return productcombinationid;
    }

    public void setProductCombinationFacility(org.museframework.bian.productcombination.dto.cr.ProductCombinationFacility productCombinationFacility) {
        this.productCombinationFacility = productCombinationFacility;
    }

    public org.museframework.bian.productcombination.dto.cr.ProductCombinationFacility getProductCombinationFacility() {
        return productCombinationFacility;
    }
}