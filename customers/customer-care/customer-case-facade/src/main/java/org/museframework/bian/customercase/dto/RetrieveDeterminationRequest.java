package org.museframework.bian.customercase.dto;

public class RetrieveDeterminationRequest {
    private String customercaseid;

    private String determinationid;

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
}