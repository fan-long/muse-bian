package org.museframework.bian.cusrelman.dto;

public class RetrieveIncidentRequest {
    private String customerrelationshipmanagementid;

    private String incidentid;

    public void setCustomerrelationshipmanagementid(String customerrelationshipmanagementid) {
        this.customerrelationshipmanagementid = customerrelationshipmanagementid;
    }

    public String getCustomerrelationshipmanagementid() {
        return customerrelationshipmanagementid;
    }

    public void setIncidentid(String incidentid) {
        this.incidentid = incidentid;
    }

    public String getIncidentid() {
        return incidentid;
    }
}