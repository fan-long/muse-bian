package org.museframework.bian.cardclearing.dto;

public class RetrieveFeesRequest {
    private String cardclearingid;

    private String feesid;

    public void setCardclearingid(String cardclearingid) {
        this.cardclearingid = cardclearingid;
    }

    public String getCardclearingid() {
        return cardclearingid;
    }

    public void setFeesid(String feesid) {
        this.feesid = feesid;
    }

    public String getFeesid() {
        return feesid;
    }
}