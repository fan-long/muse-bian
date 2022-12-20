package org.museframework.bian.cardcase.dto;

public class RetrieveArbitrationRequest {
    private String cardcaseid;

    private String arbitrationid;

    public void setCardcaseid(String cardcaseid) {
        this.cardcaseid = cardcaseid;
    }

    public String getCardcaseid() {
        return cardcaseid;
    }

    public void setArbitrationid(String arbitrationid) {
        this.arbitrationid = arbitrationid;
    }

    public String getArbitrationid() {
        return arbitrationid;
    }
}