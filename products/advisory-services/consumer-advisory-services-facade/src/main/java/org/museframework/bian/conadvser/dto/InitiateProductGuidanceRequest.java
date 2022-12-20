package org.museframework.bian.conadvser.dto;

public class InitiateProductGuidanceRequest {
    private String consumeradvisoryservicesid;

    private String productguidanceid;

    private org.museframework.bian.conadvser.dto.bq.ProductGuidance productGuidance;

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

    public void setProductGuidance(org.museframework.bian.conadvser.dto.bq.ProductGuidance productGuidance) {
        this.productGuidance = productGuidance;
    }

    public org.museframework.bian.conadvser.dto.bq.ProductGuidance getProductGuidance() {
        return productGuidance;
    }
}