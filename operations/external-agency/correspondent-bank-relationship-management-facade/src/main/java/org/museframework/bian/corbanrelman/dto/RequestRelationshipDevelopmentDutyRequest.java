package org.museframework.bian.corbanrelman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestRelationshipDevelopmentDutyRequest {
    @MetaField
    private String correspondentbankrelationshipmanagementid;

    @MetaField
    private String relationshipdevelopmentdutyid;

    @MetaField(ref=true)
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