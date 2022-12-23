package org.museframework.bian.corbanrelman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyRelationshipDevelopmentDutyRequest {
    @MetaField
    private String correspondentbankrelationshipmanagementid;

    @MetaField
    private String relationshipdevelopmentdutyid;

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
}