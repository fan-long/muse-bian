package org.museframework.bian.fiduciaryagreement.dto;

public class ExchangeFulfillmentRequest {
    private String fiduciaryagreementid;

    private String fulfillmentid;

    private org.museframework.bian.fiduciaryagreement.dto.bq.Fulfillment fulfillment;

    public void setFiduciaryagreementid(String fiduciaryagreementid) {
        this.fiduciaryagreementid = fiduciaryagreementid;
    }

    public String getFiduciaryagreementid() {
        return fiduciaryagreementid;
    }

    public void setFulfillmentid(String fulfillmentid) {
        this.fulfillmentid = fulfillmentid;
    }

    public String getFulfillmentid() {
        return fulfillmentid;
    }

    public void setFulfillment(org.museframework.bian.fiduciaryagreement.dto.bq.Fulfillment fulfillment) {
        this.fulfillment = fulfillment;
    }

    public org.museframework.bian.fiduciaryagreement.dto.bq.Fulfillment getFulfillment() {
        return fulfillment;
    }
}