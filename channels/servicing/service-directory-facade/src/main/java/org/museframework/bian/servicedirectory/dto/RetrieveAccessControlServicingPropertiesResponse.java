package org.museframework.bian.servicedirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveAccessControlServicingPropertiesResponse {
    @MetaField(ref=true)
    private org.museframework.bian.servicedirectory.dto.bq.AccessControlServicingProperties accessControlServicingProperties;

    public void setAccessControlServicingProperties(org.museframework.bian.servicedirectory.dto.bq.AccessControlServicingProperties accessControlServicingProperties) {
        this.accessControlServicingProperties = accessControlServicingProperties;
    }

    public org.museframework.bian.servicedirectory.dto.bq.AccessControlServicingProperties getAccessControlServicingProperties() {
        return accessControlServicingProperties;
    }
}