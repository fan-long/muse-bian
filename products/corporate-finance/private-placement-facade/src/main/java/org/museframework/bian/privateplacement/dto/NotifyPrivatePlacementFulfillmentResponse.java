package org.museframework.bian.privateplacement.dto;

public class NotifyPrivatePlacementFulfillmentResponse {
    private org.museframework.bian.privateplacement.dto.bq.PrivatePlacementFulfillment privatePlacementFulfillment;

    public void setPrivatePlacementFulfillment(org.museframework.bian.privateplacement.dto.bq.PrivatePlacementFulfillment privatePlacementFulfillment) {
        this.privatePlacementFulfillment = privatePlacementFulfillment;
    }

    public org.museframework.bian.privateplacement.dto.bq.PrivatePlacementFulfillment getPrivatePlacementFulfillment() {
        return privatePlacementFulfillment;
    }
}