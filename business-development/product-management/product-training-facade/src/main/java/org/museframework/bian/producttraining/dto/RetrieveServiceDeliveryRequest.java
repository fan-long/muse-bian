package org.museframework.bian.producttraining.dto;

public class RetrieveServiceDeliveryRequest {
    private String producttrainingid;

    private String servicedeliveryid;

    public void setProducttrainingid(String producttrainingid) {
        this.producttrainingid = producttrainingid;
    }

    public String getProducttrainingid() {
        return producttrainingid;
    }

    public void setServicedeliveryid(String servicedeliveryid) {
        this.servicedeliveryid = servicedeliveryid;
    }

    public String getServicedeliveryid() {
        return servicedeliveryid;
    }
}