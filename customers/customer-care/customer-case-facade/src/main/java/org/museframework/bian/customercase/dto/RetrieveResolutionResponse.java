package org.museframework.bian.customercase.dto;

public class RetrieveResolutionResponse {
    private org.museframework.bian.customercase.dto.bq.Resolution resolution;

    public void setResolution(org.museframework.bian.customercase.dto.bq.Resolution resolution) {
        this.resolution = resolution;
    }

    public org.museframework.bian.customercase.dto.bq.Resolution getResolution() {
        return resolution;
    }
}