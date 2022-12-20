package org.museframework.bian.projectfinance.dto;

public class RequestProjectFinancePlacementFulfillmentRequest {
    private String projectfinanceid;

    private String projectfinanceplacementfulfillmentid;

    private org.museframework.bian.projectfinance.dto.bq.ProjectFinancePlacementFulfillment projectFinancePlacementFulfillment;

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

    public void setProjectFinancePlacementFulfillment(org.museframework.bian.projectfinance.dto.bq.ProjectFinancePlacementFulfillment projectFinancePlacementFulfillment) {
        this.projectFinancePlacementFulfillment = projectFinancePlacementFulfillment;
    }

    public org.museframework.bian.projectfinance.dto.bq.ProjectFinancePlacementFulfillment getProjectFinancePlacementFulfillment() {
        return projectFinancePlacementFulfillment;
    }
}