package org.museframework.bian.poiofser.dto;

public class RetrieveInteractionRequest {
    private String pointofserviceid;

    private String interactionid;

    public void setPointofserviceid(String pointofserviceid) {
        this.pointofserviceid = pointofserviceid;
    }

    public String getPointofserviceid() {
        return pointofserviceid;
    }

    public void setInteractionid(String interactionid) {
        this.interactionid = interactionid;
    }

    public String getInteractionid() {
        return interactionid;
    }
}