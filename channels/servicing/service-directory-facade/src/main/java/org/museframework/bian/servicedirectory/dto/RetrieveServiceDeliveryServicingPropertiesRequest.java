package org.museframework.bian.servicedirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveServiceDeliveryServicingPropertiesRequest {
    @MetaField
    private String servicedirectoryid;

    @MetaField
    private String servicedeliveryservicingpropertiesid;

    public void setServicedirectoryid(String servicedirectoryid) {
        this.servicedirectoryid = servicedirectoryid;
    }

    public String getServicedirectoryid() {
        return servicedirectoryid;
    }

    public void setServicedeliveryservicingpropertiesid(String servicedeliveryservicingpropertiesid) {
        this.servicedeliveryservicingpropertiesid = servicedeliveryservicingpropertiesid;
    }

    public String getServicedeliveryservicingpropertiesid() {
        return servicedeliveryservicingpropertiesid;
    }
}