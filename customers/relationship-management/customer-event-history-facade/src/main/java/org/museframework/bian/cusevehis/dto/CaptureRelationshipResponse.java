package org.museframework.bian.cusevehis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class CaptureRelationshipResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cusevehis.dto.bq.Relationship relationship;

    public void setRelationship(org.museframework.bian.cusevehis.dto.bq.Relationship relationship) {
        this.relationship = relationship;
    }

    public org.museframework.bian.cusevehis.dto.bq.Relationship getRelationship() {
        return relationship;
    }
}