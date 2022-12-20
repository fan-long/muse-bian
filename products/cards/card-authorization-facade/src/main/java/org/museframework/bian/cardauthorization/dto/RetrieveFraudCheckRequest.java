package org.museframework.bian.cardauthorization.dto;

public class RetrieveFraudCheckRequest {
    private String cardauthorizationid;

    private String fraudcheckid;

    public void setCardauthorizationid(String cardauthorizationid) {
        this.cardauthorizationid = cardauthorizationid;
    }

    public String getCardauthorizationid() {
        return cardauthorizationid;
    }

    public void setFraudcheckid(String fraudcheckid) {
        this.fraudcheckid = fraudcheckid;
    }

    public String getFraudcheckid() {
        return fraudcheckid;
    }
}