package org.museframework.bian.producttraining.dto;

public class ExchangeServiceSchedulingResponse {
    private org.museframework.bian.producttraining.dto.bq.ServiceScheduling serviceScheduling;

    public void setServiceScheduling(org.museframework.bian.producttraining.dto.bq.ServiceScheduling serviceScheduling) {
        this.serviceScheduling = serviceScheduling;
    }

    public org.museframework.bian.producttraining.dto.bq.ServiceScheduling getServiceScheduling() {
        return serviceScheduling;
    }
}