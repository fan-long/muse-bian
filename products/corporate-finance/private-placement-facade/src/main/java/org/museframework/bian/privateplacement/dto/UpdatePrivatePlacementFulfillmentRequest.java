package org.museframework.bian.privateplacement.dto;

public class UpdatePrivatePlacementFulfillmentRequest {
    private String privateplacementid;

    private String privateplacementfulfillmentid;

    private org.museframework.bian.privateplacement.dto.bq.PrivatePlacementFulfillment privatePlacementFulfillment;

    public void setPrivateplacementid(String privateplacementid) {
        this.privateplacementid = privateplacementid;
    }

    public String getPrivateplacementid() {
        return privateplacementid;
    }

    public void setPrivateplacementfulfillmentid(String privateplacementfulfillmentid) {
        this.privateplacementfulfillmentid = privateplacementfulfillmentid;
    }

    public String getPrivateplacementfulfillmentid() {
        return privateplacementfulfillmentid;
    }

    public void setPrivatePlacementFulfillment(org.museframework.bian.privateplacement.dto.bq.PrivatePlacementFulfillment privatePlacementFulfillment) {
        this.privatePlacementFulfillment = privatePlacementFulfillment;
    }

    public org.museframework.bian.privateplacement.dto.bq.PrivatePlacementFulfillment getPrivatePlacementFulfillment() {
        return privatePlacementFulfillment;
    }
}