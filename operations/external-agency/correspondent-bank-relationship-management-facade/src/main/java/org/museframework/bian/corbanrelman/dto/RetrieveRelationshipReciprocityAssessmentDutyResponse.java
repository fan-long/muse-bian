package org.museframework.bian.corbanrelman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveRelationshipReciprocityAssessmentDutyResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corbanrelman.dto.bq.RelationshipReciprocityAssessmentDuty relationshipReciprocityAssessmentDuty;

    public void setRelationshipReciprocityAssessmentDuty(org.museframework.bian.corbanrelman.dto.bq.RelationshipReciprocityAssessmentDuty relationshipReciprocityAssessmentDuty) {
        this.relationshipReciprocityAssessmentDuty = relationshipReciprocityAssessmentDuty;
    }

    public org.museframework.bian.corbanrelman.dto.bq.RelationshipReciprocityAssessmentDuty getRelationshipReciprocityAssessmentDuty() {
        return relationshipReciprocityAssessmentDuty;
    }
}