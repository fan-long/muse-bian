package org.museframework.bian.projectfinance.dto;

public class RetrieveProjectFinanceSPVFulfillmentRequest {
    private String projectfinanceid;

    private String projectfinancespvfulfillmentid;

    public void setProjectfinanceid(String projectfinanceid) {
        this.projectfinanceid = projectfinanceid;
    }

    public String getProjectfinanceid() {
        return projectfinanceid;
    }

    public void setProjectfinancespvfulfillmentid(String projectfinancespvfulfillmentid) {
        this.projectfinancespvfulfillmentid = projectfinancespvfulfillmentid;
    }

    public String getProjectfinancespvfulfillmentid() {
        return projectfinancespvfulfillmentid;
    }
}