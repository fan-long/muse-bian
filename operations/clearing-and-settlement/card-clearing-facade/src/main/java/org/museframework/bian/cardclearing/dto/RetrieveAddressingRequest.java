package org.museframework.bian.cardclearing.dto;

public class RetrieveAddressingRequest {
    private String cardclearingid;

    private String addressingid;

    public void setCardclearingid(String cardclearingid) {
        this.cardclearingid = cardclearingid;
    }

    public String getCardclearingid() {
        return cardclearingid;
    }

    public void setAddressingid(String addressingid) {
        this.addressingid = addressingid;
    }

    public String getAddressingid() {
        return addressingid;
    }
}