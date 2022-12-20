package org.museframework.bian.corbanrelman.dto;

public class UpdateRelationshipReciprocityAssessmentDutyRequest {
    private String correspondentbankrelationshipmanagementid;

    private String relationshipreciprocityassessmentdutyid;

    private org.museframework.bian.corbanrelman.dto.bq.RelationshipReciprocityAssessmentDuty relationshipReciprocityAssessmentDuty;

    public void setCorrespondentbankrelationshipmanagementid(String correspondentbankrelationshipmanagementid) {
        this.correspondentbankrelationshipmanagementid = correspondentbankrelationshipmanagementid;
    }

    public String getCorrespondentbankrelationshipmanagementid() {
        return correspondentbankrelationshipmanagementid;
    }

    public void setRelationshipreciprocityassessmentdutyid(String relationshipreciprocityassessmentdutyid) {
        this.relationshipreciprocityassessmentdutyid = relationshipreciprocityassessmentdutyid;
    }

    public String getRelationshipreciprocityassessmentdutyid() {
        return relationshipreciprocityassessmentdutyid;
    }

    public void setRelationshipReciprocityAssessmentDuty(org.museframework.bian.corbanrelman.dto.bq.RelationshipReciprocityAssessmentDuty relationshipReciprocityAssessmentDuty) {
        this.relationshipReciprocityAssessmentDuty = relationshipReciprocityAssessmentDuty;
    }

    public org.museframework.bian.corbanrelman.dto.bq.RelationshipReciprocityAssessmentDuty getRelationshipReciprocityAssessmentDuty() {
        return relationshipReciprocityAssessmentDuty;
    }
}