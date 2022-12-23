package org.museframework.bian.cusrelman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CreateIncidentRequest {
    @MetaField
    private String customerrelationshipmanagementid;

    @MetaField
    private String incidentid;

    @MetaField(ref=true)
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