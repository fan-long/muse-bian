package org.museframework.bian.publicoffering.dto;

public class RequestPublicPlacementProspectusFulfillmentRequest {
    private String publicofferingid;

    private String publicplacementprospectusfulfillmentid;

    private org.museframework.bian.publicoffering.dto.bq.PublicPlacementProspectusFulfillment publicPlacementProspectusFulfillment;

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

    public void setPublicPlacementProspectusFulfillment(org.museframework.bian.publicoffering.dto.bq.PublicPlacementProspectusFulfillment publicPlacementProspectusFulfillment) {
        this.publicPlacementProspectusFulfillment = publicPlacementProspectusFulfillment;
    }

    public org.museframework.bian.publicoffering.dto.bq.PublicPlacementProspectusFulfillment getPublicPlacementProspectusFulfillment() {
        return publicPlacementProspectusFulfillment;
    }
}