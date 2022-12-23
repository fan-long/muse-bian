package org.museframework.bian.corbanrelman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeRelationshipReciprocityAssessmentDutyRequest {
    @MetaField
    private String correspondentbankrelationshipmanagementid;

    @MetaField
    private String relationshipreciprocityassessmentdutyid;

    @MetaField(ref=true)
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