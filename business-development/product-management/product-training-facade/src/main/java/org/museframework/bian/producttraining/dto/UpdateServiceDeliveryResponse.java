package org.museframework.bian.producttraining.dto;

public class UpdateServiceDeliveryResponse {
    private org.museframework.bian.producttraining.dto.bq.ServiceDelivery serviceDelivery;

    public void setServiceDelivery(org.museframework.bian.producttraining.dto.bq.ServiceDelivery serviceDelivery) {
        this.serviceDelivery = serviceDelivery;
    }

    public org.museframework.bian.producttraining.dto.bq.ServiceDelivery getServiceDelivery() {
        return serviceDelivery;
    }
}