package org.museframework.bian.cardcollections.dto;

public class UpdateResolutionRequest {
    private String cardcollectionsid;

    private String resolutionid;

    private org.museframework.bian.cardcollections.dto.bq.Resolution resolution;

    public void setCardcollectionsid(String cardcollectionsid) {
        this.cardcollectionsid = cardcollectionsid;
    }

    public String getCardcollectionsid() {
        return cardcollectionsid;
    }

    public void setResolutionid(String resolutionid) {
        this.resolutionid = resolutionid;
    }

    public String getResolutionid() {
        return resolutionid;
    }

    public void setResolution(org.museframework.bian.cardcollections.dto.bq.Resolution resolution) {
        this.resolution = resolution;
    }

    public org.museframework.bian.cardcollections.dto.bq.Resolution getResolution() {
        return resolution;
    }
}