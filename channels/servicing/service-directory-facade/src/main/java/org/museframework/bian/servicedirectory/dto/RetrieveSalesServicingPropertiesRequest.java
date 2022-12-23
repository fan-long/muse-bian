package org.museframework.bian.servicedirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveSalesServicingPropertiesRequest {
    @MetaField
    private String servicedirectoryid;

    @MetaField
    private String salesservicingpropertiesid;

    public void setServicedirectoryid(String servicedirectoryid) {
        this.servicedirectoryid = servicedirectoryid;
    }

    public String getServicedirectoryid() {
        return servicedirectoryid;
    }

    public void setSalesservicingpropertiesid(String salesservicingpropertiesid) {
        this.salesservicingpropertiesid = salesservicingpropertiesid;
    }

    public String getSalesservicingpropertiesid() {
        return salesservicingpropertiesid;
    }
}