package org.museframework.bian.cusevehis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveRelationshipRequest {
    @MetaField
    private String customereventhistoryid;

    @MetaField
    private String relationshipid;

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
}