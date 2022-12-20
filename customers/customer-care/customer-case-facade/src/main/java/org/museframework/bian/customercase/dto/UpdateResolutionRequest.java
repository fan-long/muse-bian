package org.museframework.bian.customercase.dto;

public class UpdateResolutionRequest {
    private String customercaseid;

    private String resolutionid;

    private org.museframework.bian.customercase.dto.bq.Resolution resolution;

    public void setCustomercaseid(String customercaseid) {
        this.customercaseid = customercaseid;
    }

    public String getCustomercaseid() {
        return customercaseid;
    }

    public void setResolutionid(String resolutionid) {
        this.resolutionid = resolutionid;
    }

    public String getResolutionid() {
        return resolutionid;
    }

    public void setResolution(org.museframework.bian.customercase.dto.bq.Resolution resolution) {
        this.resolution = resolution;
    }

    public org.museframework.bian.customercase.dto.bq.Resolution getResolution() {
        return resolution;
    }
}