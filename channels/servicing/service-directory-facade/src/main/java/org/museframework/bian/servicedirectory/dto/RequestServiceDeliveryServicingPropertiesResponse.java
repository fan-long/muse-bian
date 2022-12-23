package org.museframework.bian.servicedirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestServiceDeliveryServicingPropertiesResponse {
    @MetaField(ref=true)
    private org.museframework.bian.servicedirectory.dto.bq.ServiceDeliveryServicingProperties serviceDeliveryServicingProperties;

    public void setServiceDeliveryServicingProperties(org.museframework.bian.servicedirectory.dto.bq.ServiceDeliveryServicingProperties serviceDeliveryServicingProperties) {
        this.serviceDeliveryServicingProperties = serviceDeliveryServicingProperties;
    }

    public org.museframework.bian.servicedirectory.dto.bq.ServiceDeliveryServicingProperties getServiceDeliveryServicingProperties() {
        return serviceDeliveryServicingProperties;
    }
}