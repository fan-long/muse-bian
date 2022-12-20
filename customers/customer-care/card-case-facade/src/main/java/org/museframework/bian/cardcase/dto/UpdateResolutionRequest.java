package org.museframework.bian.cardcase.dto;

public class UpdateResolutionRequest {
    private String cardcaseid;

    private String resolutionid;

    private org.museframework.bian.cardcase.dto.bq.Resolution resolution;

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

    public void setResolution(org.museframework.bian.cardcase.dto.bq.Resolution resolution) {
        this.resolution = resolution;
    }

    public org.museframework.bian.cardcase.dto.bq.Resolution getResolution() {
        return resolution;
    }
}