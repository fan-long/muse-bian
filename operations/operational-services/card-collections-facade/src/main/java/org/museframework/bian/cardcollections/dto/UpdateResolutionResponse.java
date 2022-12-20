package org.museframework.bian.cardcollections.dto;

public class UpdateResolutionResponse {
    private org.museframework.bian.cardcollections.dto.bq.Resolution resolution;

    public void setResolution(org.museframework.bian.cardcollections.dto.bq.Resolution resolution) {
        this.resolution = resolution;
    }

    public org.museframework.bian.cardcollections.dto.bq.Resolution getResolution() {
        return resolution;
    }
}