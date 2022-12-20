package org.museframework.bian.projectfinance.dto;

public class InitiateProjectFinanceRepaymentFulfillmentRequest {
    private String projectfinanceid;

    private String projectfinancerepaymentfulfillmentid;

    private org.museframework.bian.projectfinance.dto.bq.ProjectFinanceRepaymentFulfillment projectFinanceRepaymentFulfillment;

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

    public void setProjectFinanceRepaymentFulfillment(org.museframework.bian.projectfinance.dto.bq.ProjectFinanceRepaymentFulfillment projectFinanceRepaymentFulfillment) {
        this.projectFinanceRepaymentFulfillment = projectFinanceRepaymentFulfillment;
    }

    public org.museframework.bian.projectfinance.dto.bq.ProjectFinanceRepaymentFulfillment getProjectFinanceRepaymentFulfillment() {
        return projectFinanceRepaymentFulfillment;
    }
}