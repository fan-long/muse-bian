package org.museframework.bian.cusevehis.dto;

public class UpdateFraudResponse {
    private org.museframework.bian.cusevehis.dto.bq.Fraud fraud;

    public void setFraud(org.museframework.bian.cusevehis.dto.bq.Fraud fraud) {
        this.fraud = fraud;
    }

    public org.museframework.bian.cusevehis.dto.bq.Fraud getFraud() {
        return fraud;
    }
}