package org.museframework.bian.cusrelman.dto;

public class UpdateIncidentRequest {
    private String customerrelationshipmanagementid;

    private String incidentid;

    private org.museframework.bian.cusrelman.dto.bq.Incident incident;

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

    public void setIncident(org.museframework.bian.cusrelman.dto.bq.Incident incident) {
        this.incident = incident;
    }

    public org.museframework.bian.cusrelman.dto.bq.Incident getIncident() {
        return incident;
    }
}