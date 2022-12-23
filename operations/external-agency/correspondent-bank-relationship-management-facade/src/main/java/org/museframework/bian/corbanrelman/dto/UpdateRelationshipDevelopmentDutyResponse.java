package org.museframework.bian.corbanrelman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateRelationshipDevelopmentDutyResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corbanrelman.dto.bq.RelationshipDevelopmentDuty relationshipDevelopmentDuty;

    public void setRelationshipDevelopmentDuty(org.museframework.bian.corbanrelman.dto.bq.RelationshipDevelopmentDuty relationshipDevelopmentDuty) {
        this.relationshipDevelopmentDuty = relationshipDevelopmentDuty;
    }

    public org.museframework.bian.corbanrelman.dto.bq.RelationshipDevelopmentDuty getRelationshipDevelopmentDuty() {
        return relationshipDevelopmentDuty;
    }
}