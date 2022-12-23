package org.museframework.bian.servicedirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestRelationshipServicingPropertiesResponse {
    @MetaField(ref=true)
    private org.museframework.bian.servicedirectory.dto.bq.RelationshipServicingProperties relationshipServicingProperties;

    public void setRelationshipServicingProperties(org.museframework.bian.servicedirectory.dto.bq.RelationshipServicingProperties relationshipServicingProperties) {
        this.relationshipServicingProperties = relationshipServicingProperties;
    }

    public org.museframework.bian.servicedirectory.dto.bq.RelationshipServicingProperties getRelationshipServicingProperties() {
        return relationshipServicingProperties;
    }
}