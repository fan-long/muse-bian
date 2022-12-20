package org.museframework.bian.cardauthorization.dto;

public class RetrieveCreditCheckRequest {
    private String cardauthorizationid;

    private String creditcheckid;

    public void setCardauthorizationid(String cardauthorizationid) {
        this.cardauthorizationid = cardauthorizationid;
    }

    public String getCardauthorizationid() {
        return cardauthorizationid;
    }

    public void setCreditcheckid(String creditcheckid) {
        this.creditcheckid = creditcheckid;
    }

    public String getCreditcheckid() {
        return creditcheckid;
    }
}