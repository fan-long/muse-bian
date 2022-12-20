package org.museframework.bian.fiduciaryagreement.dto;

public class RetrieveFulfillmentRequest {
    private String fiduciaryagreementid;

    private String fulfillmentid;

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
}