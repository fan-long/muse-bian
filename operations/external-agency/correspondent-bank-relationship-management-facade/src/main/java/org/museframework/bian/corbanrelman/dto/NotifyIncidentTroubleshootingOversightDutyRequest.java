package org.museframework.bian.corbanrelman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyIncidentTroubleshootingOversightDutyRequest {
    @MetaField
    private String correspondentbankrelationshipmanagementid;

    @MetaField
    private String incidenttroubleshootingoversightdutyid;

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
}