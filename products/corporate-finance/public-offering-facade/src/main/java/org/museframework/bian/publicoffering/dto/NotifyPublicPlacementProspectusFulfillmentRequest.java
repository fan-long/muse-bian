package org.museframework.bian.publicoffering.dto;

public class NotifyPublicPlacementProspectusFulfillmentRequest {
    private String publicofferingid;

    private String publicplacementprospectusfulfillmentid;

    public void setPublicofferingid(String publicofferingid) {
        this.publicofferingid = publicofferingid;
    }

    public String getPublicofferingid() {
        return publicofferingid;
    }

    public void setPublicplacementprospectusfulfillmentid(String publicplacementprospectusfulfillmentid) {
        this.publicplacementprospectusfulfillmentid = publicplacementprospectusfulfillmentid;
    }

    public String getPublicplacementprospectusfulfillmentid() {
        return publicplacementprospectusfulfillmentid;
    }
}