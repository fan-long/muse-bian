package org.museframework.bian.corbanrelman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateIncidentTroubleshootingOversightDutyResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corbanrelman.dto.bq.IncidentTroubleshootingOversightDuty incidentTroubleshootingOversightDuty;

    public void setIncidentTroubleshootingOversightDuty(org.museframework.bian.corbanrelman.dto.bq.IncidentTroubleshootingOversightDuty incidentTroubleshootingOversightDuty) {
        this.incidentTroubleshootingOversightDuty = incidentTroubleshootingOversightDuty;
    }

    public org.museframework.bian.corbanrelman.dto.bq.IncidentTroubleshootingOversightDuty getIncidentTroubleshootingOversightDuty() {
        return incidentTroubleshootingOversightDuty;
    }
}