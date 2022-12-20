package org.museframework.bian.bralocman.dto;

public class ControlProductandServicePlanningRequest {
    private String branchlocationmanagementid;

    private String productandserviceplanningid;

    private org.museframework.bian.bralocman.dto.bq.ProductandServicePlanning productandServicePlanning;

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

    public void setProductandServicePlanning(org.museframework.bian.bralocman.dto.bq.ProductandServicePlanning productandServicePlanning) {
        this.productandServicePlanning = productandServicePlanning;
    }

    public org.museframework.bian.bralocman.dto.bq.ProductandServicePlanning getProductandServicePlanning() {
        return productandServicePlanning;
    }
}