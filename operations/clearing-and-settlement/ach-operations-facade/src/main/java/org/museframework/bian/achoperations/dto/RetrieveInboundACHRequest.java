package org.museframework.bian.achoperations.dto;

public class RetrieveInboundACHRequest {
    private String achoperationsid;

    private String inboundachid;

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
}