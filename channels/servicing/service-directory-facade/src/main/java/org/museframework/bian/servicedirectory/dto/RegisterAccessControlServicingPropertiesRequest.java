package org.museframework.bian.servicedirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RegisterAccessControlServicingPropertiesRequest {
    @MetaField
    private String servicedirectoryid;

    @MetaField
    private String accesscontrolservicingpropertiesid;

    @MetaField(ref=true)
    private org.museframework.bian.servicedirectory.dto.bq.AccessControlServicingProperties accessControlServicingProperties;

    public void setServicedirectoryid(String servicedirectoryid) {
        this.servicedirectoryid = servicedirectoryid;
    }

    public String getServicedirectoryid() {
        return servicedirectoryid;
    }

    public void setAccesscontrolservicingpropertiesid(String accesscontrolservicingpropertiesid) {
        this.accesscontrolservicingpropertiesid = accesscontrolservicingpropertiesid;
    }

    public String getAccesscontrolservicingpropertiesid() {
        return accesscontrolservicingpropertiesid;
    }

    public void setAccessControlServicingProperties(org.museframework.bian.servicedirectory.dto.bq.AccessControlServicingProperties accessControlServicingProperties) {
        this.accessControlServicingProperties = accessControlServicingProperties;
    }

    public org.museframework.bian.servicedirectory.dto.bq.AccessControlServicingProperties getAccessControlServicingProperties() {
        return accessControlServicingProperties;
    }
}