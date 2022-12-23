package org.museframework.bian.servicedirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestServiceDeliveryServicingPropertiesRequest {
    @MetaField
    private String servicedirectoryid;

    @MetaField
    private String servicedeliveryservicingpropertiesid;

    @MetaField(ref=true)
    private org.museframework.bian.servicedirectory.dto.bq.ServiceDeliveryServicingProperties serviceDeliveryServicingProperties;

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

    public void setServiceDeliveryServicingProperties(org.museframework.bian.servicedirectory.dto.bq.ServiceDeliveryServicingProperties serviceDeliveryServicingProperties) {
        this.serviceDeliveryServicingProperties = serviceDeliveryServicingProperties;
    }

    public org.museframework.bian.servicedirectory.dto.bq.ServiceDeliveryServicingProperties getServiceDeliveryServicingProperties() {
        return serviceDeliveryServicingProperties;
    }
}