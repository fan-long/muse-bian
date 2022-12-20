package org.museframework.bian.projectfinance.dto;

public class ExchangeProjectFinanceSPVFulfillmentRequest {
    private String projectfinanceid;

    private String projectfinancespvfulfillmentid;

    private org.museframework.bian.projectfinance.dto.bq.ProjectFinanceSPVFulfillment projectFinanceSPVFulfillment;

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

    public void setProjectFinanceSPVFulfillment(org.museframework.bian.projectfinance.dto.bq.ProjectFinanceSPVFulfillment projectFinanceSPVFulfillment) {
        this.projectFinanceSPVFulfillment = projectFinanceSPVFulfillment;
    }

    public org.museframework.bian.projectfinance.dto.bq.ProjectFinanceSPVFulfillment getProjectFinanceSPVFulfillment() {
        return projectFinanceSPVFulfillment;
    }
}