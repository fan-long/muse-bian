package org.museframework.bian.poiofser.dto;

public class UpdateAssistedRequest {
    private String pointofserviceid;

    private String assistedid;

    private org.museframework.bian.poiofser.dto.bq.Assisted assisted;

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

    public void setAssisted(org.museframework.bian.poiofser.dto.bq.Assisted assisted) {
        this.assisted = assisted;
    }

    public org.museframework.bian.poiofser.dto.bq.Assisted getAssisted() {
        return assisted;
    }
}