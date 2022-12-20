package org.museframework.bian.productcombination.dto;

public class RequestFulfillmentRequest {
    private String productcombinationid;

    private String fulfillmentid;

    private org.museframework.bian.productcombination.dto.bq.Fulfillment fulfillment;

    public void setProductcombinationid(String productcombinationid) {
        this.productcombinationid = productcombinationid;
    }

    public String getProductcombinationid() {
        return productcombinationid;
    }

    public void setFulfillmentid(String fulfillmentid) {
        this.fulfillmentid = fulfillmentid;
    }

    public String getFulfillmentid() {
        return fulfillmentid;
    }

    public void setFulfillment(org.museframework.bian.productcombination.dto.bq.Fulfillment fulfillment) {
        this.fulfillment = fulfillment;
    }

    public org.museframework.bian.productcombination.dto.bq.Fulfillment getFulfillment() {
        return fulfillment;
    }
}