package org.museframework.bian.projectfinance.dto;

public class InitiateProjectFinanceArrangementFulfillmentRequest {
    private String projectfinanceid;

    private String projectfinancearrangementfulfillmentid;

    private org.museframework.bian.projectfinance.dto.bq.ProjectFinanceArrangementFulfillment projectFinanceArrangementFulfillment;

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

    public void setProjectFinanceArrangementFulfillment(org.museframework.bian.projectfinance.dto.bq.ProjectFinanceArrangementFulfillment projectFinanceArrangementFulfillment) {
        this.projectFinanceArrangementFulfillment = projectFinanceArrangementFulfillment;
    }

    public org.museframework.bian.projectfinance.dto.bq.ProjectFinanceArrangementFulfillment getProjectFinanceArrangementFulfillment() {
        return projectFinanceArrangementFulfillment;
    }
}