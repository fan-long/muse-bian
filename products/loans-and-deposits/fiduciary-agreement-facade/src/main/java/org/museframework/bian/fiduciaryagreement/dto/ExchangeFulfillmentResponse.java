package org.museframework.bian.fiduciaryagreement.dto;

public class ExchangeFulfillmentResponse {
    private org.museframework.bian.fiduciaryagreement.dto.bq.Fulfillment fulfillment;

    public void setFulfillment(org.museframework.bian.fiduciaryagreement.dto.bq.Fulfillment fulfillment) {
        this.fulfillment = fulfillment;
    }

    public org.museframework.bian.fiduciaryagreement.dto.bq.Fulfillment getFulfillment() {
        return fulfillment;
    }
}