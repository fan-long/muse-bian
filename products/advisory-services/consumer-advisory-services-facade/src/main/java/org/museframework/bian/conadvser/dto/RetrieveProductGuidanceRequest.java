package org.museframework.bian.conadvser.dto;

public class RetrieveProductGuidanceRequest {
    private String consumeradvisoryservicesid;

    private String productguidanceid;

    public void setConsumeradvisoryservicesid(String consumeradvisoryservicesid) {
        this.consumeradvisoryservicesid = consumeradvisoryservicesid;
    }

    public String getConsumeradvisoryservicesid() {
        return consumeradvisoryservicesid;
    }

    public void setProductguidanceid(String productguidanceid) {
        this.productguidanceid = productguidanceid;
    }

    public String getProductguidanceid() {
        return productguidanceid;
    }
}