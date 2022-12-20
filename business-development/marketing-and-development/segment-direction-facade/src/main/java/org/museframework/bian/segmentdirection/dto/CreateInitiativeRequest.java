package org.museframework.bian.segmentdirection.dto;

public class CreateInitiativeRequest {
    private String segmentdirectionid;

    private String initiativeid;

    private org.museframework.bian.segmentdirection.dto.bq.Initiative initiative;

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

    public void setInitiative(org.museframework.bian.segmentdirection.dto.bq.Initiative initiative) {
        this.initiative = initiative;
    }

    public org.museframework.bian.segmentdirection.dto.bq.Initiative getInitiative() {
        return initiative;
    }
}