package org.museframework.bian.producttraining.dto;

public class ExchangeServiceSchedulingRequest {
    private String producttrainingid;

    private String serviceschedulingid;

    private org.museframework.bian.producttraining.dto.bq.ServiceScheduling serviceScheduling;

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

    public void setServiceScheduling(org.museframework.bian.producttraining.dto.bq.ServiceScheduling serviceScheduling) {
        this.serviceScheduling = serviceScheduling;
    }

    public org.museframework.bian.producttraining.dto.bq.ServiceScheduling getServiceScheduling() {
        return serviceScheduling;
    }
}