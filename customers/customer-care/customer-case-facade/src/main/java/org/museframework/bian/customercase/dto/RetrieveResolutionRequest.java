package org.museframework.bian.customercase.dto;

public class RetrieveResolutionRequest {
    private String customercaseid;

    private String resolutionid;

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
}