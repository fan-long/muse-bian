package org.museframework.bian.cardauthorization.dto;

public class RetrieveStandInRequest {
    private String cardauthorizationid;

    private String standinid;

    public void setCardauthorizationid(String cardauthorizationid) {
        this.cardauthorizationid = cardauthorizationid;
    }

    public String getCardauthorizationid() {
        return cardauthorizationid;
    }

    public void setStandinid(String standinid) {
        this.standinid = standinid;
    }

    public String getStandinid() {
        return standinid;
    }
}