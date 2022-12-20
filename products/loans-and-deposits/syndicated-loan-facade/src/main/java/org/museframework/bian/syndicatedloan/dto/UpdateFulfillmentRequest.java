package org.museframework.bian.syndicatedloan.dto;

public class UpdateFulfillmentRequest {
    private String syndicatedloanid;

    private String fulfillmentid;

    private org.museframework.bian.syndicatedloan.dto.bq.Fulfillment fulfillment;

    public void setSyndicatedloanid(String syndicatedloanid) {
        this.syndicatedloanid = syndicatedloanid;
    }

    public String getSyndicatedloanid() {
        return syndicatedloanid;
    }

    public void setFulfillmentid(String fulfillmentid) {
        this.fulfillmentid = fulfillmentid;
    }

    public String getFulfillmentid() {
        return fulfillmentid;
    }

    public void setFulfillment(org.museframework.bian.syndicatedloan.dto.bq.Fulfillment fulfillment) {
        this.fulfillment = fulfillment;
    }

    public org.museframework.bian.syndicatedloan.dto.bq.Fulfillment getFulfillment() {
        return fulfillment;
    }
}