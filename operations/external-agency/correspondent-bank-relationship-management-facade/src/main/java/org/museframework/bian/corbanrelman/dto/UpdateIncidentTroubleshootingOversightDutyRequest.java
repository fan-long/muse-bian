package org.museframework.bian.corbanrelman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateIncidentTroubleshootingOversightDutyRequest {
    @MetaField
    private String correspondentbankrelationshipmanagementid;

    @MetaField
    private String incidenttroubleshootingoversightdutyid;

    @MetaField(ref=true)
    private org.museframework.bian.corbanrelman.dto.bq.IncidentTroubleshootingOversightDuty incidentTroubleshootingOversightDuty;

    public void setCorrespondentbankrelationshipmanagementid(String correspondentbankrelationshipmanagementid) {
        this.correspondentbankrelationshipmanagementid = correspondentbankrelationshipmanagementid;
    }

    public String getCorrespondentbankrelationshipmanagementid() {
        return correspondentbankrelationshipmanagementid;
    }

    public void setIncidenttroubleshootingoversightdutyid(String incidenttroubleshootingoversightdutyid) {
        this.incidenttroubleshootingoversightdutyid = incidenttroubleshootingoversightdutyid;
    }

    public String getIncidenttroubleshootingoversightdutyid() {
        return incidenttroubleshootingoversightdutyid;
    }

    public void setIncidentTroubleshootingOversightDuty(org.museframework.bian.corbanrelman.dto.bq.IncidentTroubleshootingOversightDuty incidentTroubleshootingOversightDuty) {
        this.incidentTroubleshootingOversightDuty = incidentTroubleshootingOversightDuty;
    }

    public org.museframework.bian.corbanrelman.dto.bq.IncidentTroubleshootingOversightDuty getIncidentTroubleshootingOversightDuty() {
        return incidentTroubleshootingOversightDuty;
    }
}