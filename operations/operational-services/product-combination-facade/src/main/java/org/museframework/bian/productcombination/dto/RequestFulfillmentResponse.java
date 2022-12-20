package org.museframework.bian.productcombination.dto;

public class RequestFulfillmentResponse {
    private org.museframework.bian.productcombination.dto.bq.Fulfillment fulfillment;

    public void setFulfillment(org.museframework.bian.productcombination.dto.bq.Fulfillment fulfillment) {
        this.fulfillment = fulfillment;
    }

    public org.museframework.bian.productcombination.dto.bq.Fulfillment getFulfillment() {
        return fulfillment;
    }
}