package org.museframework.bian.cardcase.dto;

public class RetrieveChargebackRequest {
    private String cardcaseid;

    private String chargebackid;

    public void setCardcaseid(String cardcaseid) {
        this.cardcaseid = cardcaseid;
    }

    public String getCardcaseid() {
        return cardcaseid;
    }

    public void setChargebackid(String chargebackid) {
        this.chargebackid = chargebackid;
    }

    public String getChargebackid() {
        return chargebackid;
    }
}