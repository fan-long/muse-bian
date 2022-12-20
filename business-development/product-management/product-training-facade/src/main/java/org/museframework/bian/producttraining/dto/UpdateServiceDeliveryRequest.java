package org.museframework.bian.producttraining.dto;

public class UpdateServiceDeliveryRequest {
    private String producttrainingid;

    private String servicedeliveryid;

    private org.museframework.bian.producttraining.dto.bq.ServiceDelivery serviceDelivery;

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

    public void setServiceDelivery(org.museframework.bian.producttraining.dto.bq.ServiceDelivery serviceDelivery) {
        this.serviceDelivery = serviceDelivery;
    }

    public org.museframework.bian.producttraining.dto.bq.ServiceDelivery getServiceDelivery() {
        return serviceDelivery;
    }
}