package org.museframework.bian.cusrelman.dto;

public class UpdateIncidentResponse {
    private org.museframework.bian.cusrelman.dto.bq.Incident incident;

    public void setIncident(org.museframework.bian.cusrelman.dto.bq.Incident incident) {
        this.incident = incident;
    }

    public org.museframework.bian.cusrelman.dto.bq.Incident getIncident() {
        return incident;
    }
}