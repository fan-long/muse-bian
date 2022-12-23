package org.museframework.bian.cusevehis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateRelationshipRequest {
    @MetaField
    private String customereventhistoryid;

    @MetaField
    private String relationshipid;

    @MetaField(ref=true)
    private org.museframework.bian.cusevehis.dto.bq.Relationship relationship;

    public void setCustomereventhistoryid(String customereventhistoryid) {
        this.customereventhistoryid = customereventhistoryid;
    }

    public String getCustomereventhistoryid() {
        return customereventhistoryid;
    }

    public void setRelationshipid(String relationshipid) {
        this.relationshipid = relationshipid;
    }

    public String getRelationshipid() {
        return relationshipid;
    }

    public void setRelationship(org.museframework.bian.cusevehis.dto.bq.Relationship relationship) {
        this.relationship = relationship;
    }

    public org.museframework.bian.cusevehis.dto.bq.Relationship getRelationship() {
        return relationship;
    }
}