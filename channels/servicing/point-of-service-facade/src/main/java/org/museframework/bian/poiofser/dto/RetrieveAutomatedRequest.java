package org.museframework.bian.poiofser.dto;

public class RetrieveAutomatedRequest {
    private String pointofserviceid;

    private String automatedid;

    public void setPointofserviceid(String pointofserviceid) {
        this.pointofserviceid = pointofserviceid;
    }

    public String getPointofserviceid() {
        return pointofserviceid;
    }

    public void setAutomatedid(String automatedid) {
        this.automatedid = automatedid;
    }

    public String getAutomatedid() {
        return automatedid;
    }
}