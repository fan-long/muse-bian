package org.museframework.bian.achoperations.dto;

public class UpdateOutboundACHRequest {
    private String achoperationsid;

    private String outboundachid;

    private org.museframework.bian.achoperations.dto.bq.OutboundACH outboundACH;

    public void setAchoperationsid(String achoperationsid) {
        this.achoperationsid = achoperationsid;
    }

    public String getAchoperationsid() {
        return achoperationsid;
    }

    public void setOutboundachid(String outboundachid) {
        this.outboundachid = outboundachid;
    }

    public String getOutboundachid() {
        return outboundachid;
    }

    public void setOutboundACH(org.museframework.bian.achoperations.dto.bq.OutboundACH outboundACH) {
        this.outboundACH = outboundACH;
    }

    public org.museframework.bian.achoperations.dto.bq.OutboundACH getOutboundACH() {
        return outboundACH;
    }
}