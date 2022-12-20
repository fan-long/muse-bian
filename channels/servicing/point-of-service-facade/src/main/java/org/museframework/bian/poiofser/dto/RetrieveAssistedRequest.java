package org.museframework.bian.poiofser.dto;

public class RetrieveAssistedRequest {
    private String pointofserviceid;

    private String assistedid;

    public void setPointofserviceid(String pointofserviceid) {
        this.pointofserviceid = pointofserviceid;
    }

    public String getPointofserviceid() {
        return pointofserviceid;
    }

    public void setAssistedid(String assistedid) {
        this.assistedid = assistedid;
    }

    public String getAssistedid() {
        return assistedid;
    }
}