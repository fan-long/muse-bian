package org.museframework.bian.corbanrelman.dto;

public class GrantRelationshipDevelopmentDutyRequest {
    private String correspondentbankrelationshipmanagementid;

    private String relationshipdevelopmentdutyid;

    private org.museframework.bian.corbanrelman.dto.bq.RelationshipDevelopmentDuty relationshipDevelopmentDuty;

    public void setCorrespondentbankrelationshipmanagementid(String correspondentbankrelationshipmanagementid) {
        this.correspondentbankrelationshipmanagementid = correspondentbankrelationshipmanagementid;
    }

    public String getCorrespondentbankrelationshipmanagementid() {
        return correspondentbankrelationshipmanagementid;
    }

    public void setRelationshipdevelopmentdutyid(String relationshipdevelopmentdutyid) {
        this.relationshipdevelopmentdutyid = relationshipdevelopmentdutyid;
    }

    public String getRelationshipdevelopmentdutyid() {
        return relationshipdevelopmentdutyid;
    }

    public void setRelationshipDevelopmentDuty(org.museframework.bian.corbanrelman.dto.bq.RelationshipDevelopmentDuty relationshipDevelopmentDuty) {
        this.relationshipDevelopmentDuty = relationshipDevelopmentDuty;
    }

    public org.museframework.bian.corbanrelman.dto.bq.RelationshipDevelopmentDuty getRelationshipDevelopmentDuty() {
        return relationshipDevelopmentDuty;
    }
}