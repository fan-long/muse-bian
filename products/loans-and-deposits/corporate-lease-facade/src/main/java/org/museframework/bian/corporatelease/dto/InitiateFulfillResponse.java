package org.museframework.bian.corporatelease.dto;

public class InitiateFulfillResponse {
    private org.museframework.bian.corporatelease.dto.bq.Fulfill fulfill;

    public void setFulfill(org.museframework.bian.corporatelease.dto.bq.Fulfill fulfill) {
        this.fulfill = fulfill;
    }

    public org.museframework.bian.corporatelease.dto.bq.Fulfill getFulfill() {
        return fulfill;
    }
}