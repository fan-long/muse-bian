package org.museframework.bian.cardclearing.dto;

public class RetrieveMatchingRequest {
    private String cardclearingid;

    private String matchingid;

    public void setCardclearingid(String cardclearingid) {
        this.cardclearingid = cardclearingid;
    }

    public String getCardclearingid() {
        return cardclearingid;
    }

    public void setMatchingid(String matchingid) {
        this.matchingid = matchingid;
    }

    public String getMatchingid() {
        return matchingid;
    }
}