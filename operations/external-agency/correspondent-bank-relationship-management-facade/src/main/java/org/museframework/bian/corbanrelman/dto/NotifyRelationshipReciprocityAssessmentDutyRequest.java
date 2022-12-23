package org.museframework.bian.corbanrelman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyRelationshipReciprocityAssessmentDutyRequest {
    @MetaField
    private String correspondentbankrelationshipmanagementid;

    @MetaField
    private String relationshipreciprocityassessmentdutyid;

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
}