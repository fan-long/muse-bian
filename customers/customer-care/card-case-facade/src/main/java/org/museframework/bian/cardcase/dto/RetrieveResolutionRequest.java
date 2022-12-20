package org.museframework.bian.cardcase.dto;

public class RetrieveResolutionRequest {
    private String cardcaseid;

    private String resolutionid;

    public void setCardcaseid(String cardcaseid) {
        this.cardcaseid = cardcaseid;
    }

    public String getCardcaseid() {
        return cardcaseid;
    }

    public void setResolutionid(String resolutionid) {
        this.resolutionid = resolutionid;
    }

    public String getResolutionid() {
        return resolutionid;
    }
}