package org.museframework.bian.poiofser.dto;

public class InitiateAutomatedRequest {
    private String pointofserviceid;

    private String automatedid;

    private org.museframework.bian.poiofser.dto.bq.Automated automated;

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

    public void setAutomated(org.museframework.bian.poiofser.dto.bq.Automated automated) {
        this.automated = automated;
    }

    public org.museframework.bian.poiofser.dto.bq.Automated getAutomated() {
        return automated;
    }
}