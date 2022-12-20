package org.museframework.bian.customercase.dto;

public class UpdateDeterminationRequest {
    private String customercaseid;

    private String determinationid;

    private org.museframework.bian.customercase.dto.bq.Determination determination;

    public void setCustomercaseid(String customercaseid) {
        this.customercaseid = customercaseid;
    }

    public String getCustomercaseid() {
        return customercaseid;
    }

    public void setDeterminationid(String determinationid) {
        this.determinationid = determinationid;
    }

    public String getDeterminationid() {
        return determinationid;
    }

    public void setDetermination(org.museframework.bian.customercase.dto.bq.Determination determination) {
        this.determination = determination;
    }

    public org.museframework.bian.customercase.dto.bq.Determination getDetermination() {
        return determination;
    }
}