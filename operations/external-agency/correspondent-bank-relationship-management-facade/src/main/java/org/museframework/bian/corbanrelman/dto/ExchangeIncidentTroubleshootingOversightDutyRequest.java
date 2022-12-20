package org.museframework.bian.corbanrelman.dto;

public class ExchangeIncidentTroubleshootingOversightDutyRequest {
    private String correspondentbankrelationshipmanagementid;

    private String incidenttroubleshootingoversightdutyid;

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