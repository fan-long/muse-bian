package org.museframework.bian.publicoffering.dto;

public class RetrievePublicPlacementIPOandUnderwritingFulfillmentRequest {
    private String publicofferingid;

    private String publicplacementipoandunderwritingfulfillmentid;

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
}