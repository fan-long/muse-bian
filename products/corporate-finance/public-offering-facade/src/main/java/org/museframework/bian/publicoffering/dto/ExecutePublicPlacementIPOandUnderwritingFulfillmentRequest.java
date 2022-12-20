package org.museframework.bian.publicoffering.dto;

public class ExecutePublicPlacementIPOandUnderwritingFulfillmentRequest {
    private String publicofferingid;

    private String publicplacementipoandunderwritingfulfillmentid;

    private org.museframework.bian.publicoffering.dto.bq.PublicPlacementIPOandUnderwritingFulfillment publicPlacementIPOandUnderwritingFulfillment;

    public void setPublicofferingid(String publicofferingid) {
        this.publicofferingid = publicofferingid;
    }

    public String getPublicofferingid() {
        return publicofferingid;
    }

    public void setPublicplacementipoandunderwritingfulfillmentid(String publicplacementipoandunderwritingfulfillmentid) {
        this.publicplacementipoandunderwritingfulfillmentid = publicplacementipoandunderwritingfulfillmentid;
    }

    public String getPublicplacementipoandunderwritingfulfillmentid() {
        return publicplacementipoandunderwritingfulfillmentid;
    }

    public void setPublicPlacementIPOandUnderwritingFulfillment(org.museframework.bian.publicoffering.dto.bq.PublicPlacementIPOandUnderwritingFulfillment publicPlacementIPOandUnderwritingFulfillment) {
        this.publicPlacementIPOandUnderwritingFulfillment = publicPlacementIPOandUnderwritingFulfillment;
    }

    public org.museframework.bian.publicoffering.dto.bq.PublicPlacementIPOandUnderwritingFulfillment getPublicPlacementIPOandUnderwritingFulfillment() {
        return publicPlacementIPOandUnderwritingFulfillment;
    }
}