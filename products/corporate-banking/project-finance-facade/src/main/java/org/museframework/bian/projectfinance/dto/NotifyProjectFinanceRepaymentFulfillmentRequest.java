package org.museframework.bian.projectfinance.dto;

public class NotifyProjectFinanceRepaymentFulfillmentRequest {
    private String projectfinanceid;

    private String projectfinancerepaymentfulfillmentid;

    public void setProjectfinanceid(String projectfinanceid) {
        this.projectfinanceid = projectfinanceid;
    }

    public String getProjectfinanceid() {
        return projectfinanceid;
    }

    public void setProjectfinancerepaymentfulfillmentid(String projectfinancerepaymentfulfillmentid) {
        this.projectfinancerepaymentfulfillmentid = projectfinancerepaymentfulfillmentid;
    }

    public String getProjectfinancerepaymentfulfillmentid() {
        return projectfinancerepaymentfulfillmentid;
    }
}