package org.museframework.bian.cardauthorization.dto;

public class RetrieveFraudCheckResponse {
    private org.museframework.bian.cardauthorization.dto.bq.FraudCheck fraudCheck;

    public void setFraudCheck(org.museframework.bian.cardauthorization.dto.bq.FraudCheck fraudCheck) {
        this.fraudCheck = fraudCheck;
    }

    public org.museframework.bian.cardauthorization.dto.bq.FraudCheck getFraudCheck() {
        return fraudCheck;
    }
}