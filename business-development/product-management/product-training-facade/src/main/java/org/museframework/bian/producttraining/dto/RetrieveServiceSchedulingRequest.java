package org.museframework.bian.producttraining.dto;

public class RetrieveServiceSchedulingRequest {
    private String producttrainingid;

    private String serviceschedulingid;

    public void setProducttrainingid(String producttrainingid) {
        this.producttrainingid = producttrainingid;
    }

    public String getProducttrainingid() {
        return producttrainingid;
    }

    public void setServiceschedulingid(String serviceschedulingid) {
        this.serviceschedulingid = serviceschedulingid;
    }

    public String getServiceschedulingid() {
        return serviceschedulingid;
    }
}