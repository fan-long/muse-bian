package org.museframework.bian.syndicatedloan.dto;

public class UpdateFulfillmentResponse {
    private org.museframework.bian.syndicatedloan.dto.bq.Fulfillment fulfillment;

    public void setFulfillment(org.museframework.bian.syndicatedloan.dto.bq.Fulfillment fulfillment) {
        this.fulfillment = fulfillment;
    }

    public org.museframework.bian.syndicatedloan.dto.bq.Fulfillment getFulfillment() {
        return fulfillment;
    }
}