package org.museframework.bian.projectfinance.dto;

public class NotifyProjectFinanceArrangementFulfillmentRequest {
    private String projectfinanceid;

    private String projectfinancearrangementfulfillmentid;

    public void setProjectfinanceid(String projectfinanceid) {
        this.projectfinanceid = projectfinanceid;
    }

    public String getProjectfinanceid() {
        return projectfinanceid;
    }

    public void setProjectfinancearrangementfulfillmentid(String projectfinancearrangementfulfillmentid) {
        this.projectfinancearrangementfulfillmentid = projectfinancearrangementfulfillmentid;
    }

    public String getProjectfinancearrangementfulfillmentid() {
        return projectfinancearrangementfulfillmentid;
    }
}