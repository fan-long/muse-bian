package org.museframework.bian.bralocman.dto;

public class RetrieveProductandServicePlanningRequest {
    private String branchlocationmanagementid;

    private String productandserviceplanningid;

    public void setBranchlocationmanagementid(String branchlocationmanagementid) {
        this.branchlocationmanagementid = branchlocationmanagementid;
    }

    public String getBranchlocationmanagementid() {
        return branchlocationmanagementid;
    }

    public void setProductandserviceplanningid(String productandserviceplanningid) {
        this.productandserviceplanningid = productandserviceplanningid;
    }

    public String getProductandserviceplanningid() {
        return productandserviceplanningid;
    }
}