package org.museframework.bian.achoperations.dto;

public class InitiateInboundACHRequest {
    private String achoperationsid;

    private String inboundachid;

    private org.museframework.bian.achoperations.dto.bq.InboundACH inboundACH;

    public void setAchoperationsid(String achoperationsid) {
        this.achoperationsid = achoperationsid;
    }

    public String getAchoperationsid() {
        return achoperationsid;
    }

    public void setInboundachid(String inboundachid) {
        this.inboundachid = inboundachid;
    }

    public String getInboundachid() {
        return inboundachid;
    }

    public void setInboundACH(org.museframework.bian.achoperations.dto.bq.InboundACH inboundACH) {
        this.inboundACH = inboundACH;
    }

    public org.museframework.bian.achoperations.dto.bq.InboundACH getInboundACH() {
        return inboundACH;
    }
}