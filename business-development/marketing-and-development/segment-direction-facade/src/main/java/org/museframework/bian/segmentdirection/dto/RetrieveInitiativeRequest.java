package org.museframework.bian.segmentdirection.dto;

public class RetrieveInitiativeRequest {
    private String segmentdirectionid;

    private String initiativeid;

    public void setSegmentdirectionid(String segmentdirectionid) {
        this.segmentdirectionid = segmentdirectionid;
    }

    public String getSegmentdirectionid() {
        return segmentdirectionid;
    }

    public void setInitiativeid(String initiativeid) {
        this.initiativeid = initiativeid;
    }

    public String getInitiativeid() {
        return initiativeid;
    }
}