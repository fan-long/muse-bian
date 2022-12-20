package org.museframework.bian.achoperations.dto;

public class RetrieveOutboundACHRequest {
    private String achoperationsid;

    private String outboundachid;

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
}