package org.museframework.bian.servicedirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveRelationshipServicingPropertiesRequest {
    @MetaField
    private String servicedirectoryid;

    @MetaField
    private String relationshipservicingpropertiesid;

    public void setServicedirectoryid(String servicedirectoryid) {
        this.servicedirectoryid = servicedirectoryid;
    }

    public String getServicedirectoryid() {
        return servicedirectoryid;
    }

    public void setRelationshipservicingpropertiesid(String relationshipservicingpropertiesid) {
        this.relationshipservicingpropertiesid = relationshipservicingpropertiesid;
    }

    public String getRelationshipservicingpropertiesid() {
        return relationshipservicingpropertiesid;
    }
}