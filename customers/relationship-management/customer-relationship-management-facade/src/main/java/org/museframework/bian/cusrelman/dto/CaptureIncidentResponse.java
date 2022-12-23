package org.museframework.bian.cusrelman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class CaptureIncidentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cusrelman.dto.bq.Incident incident;

    public void setIncident(org.museframework.bian.cusrelman.dto.bq.Incident incident) {
        this.incident = incident;
    }

    public org.museframework.bian.cusrelman.dto.bq.Incident getIncident() {
        return incident;
    }
}