package org.museframework.bian.opeiteman.dto;

public class RetrieveTrackingRequest {
    private String openitemmanagementid;

    private String trackingid;

    public void setOpenitemmanagementid(String openitemmanagementid) {
        this.openitemmanagementid = openitemmanagementid;
    }

    public String getOpenitemmanagementid() {
        return openitemmanagementid;
    }

    public void setTrackingid(String trackingid) {
        this.trackingid = trackingid;
    }

    public String getTrackingid() {
        return trackingid;
    }
}