package org.museframework.bian.projectfinance.dto;

public class RetrieveProjectFinancePlacementFulfillmentRequest {
    private String projectfinanceid;

    private String projectfinanceplacementfulfillmentid;

    public void setProjectfinanceid(String projectfinanceid) {
        this.projectfinanceid = projectfinanceid;
    }

    public String getProjectfinanceid() {
        return projectfinanceid;
    }

    public void setProjectfinanceplacementfulfillmentid(String projectfinanceplacementfulfillmentid) {
        this.projectfinanceplacementfulfillmentid = projectfinanceplacementfulfillmentid;
    }

    public String getProjectfinanceplacementfulfillmentid() {
        return projectfinanceplacementfulfillmentid;
    }
}