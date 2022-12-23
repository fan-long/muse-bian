package org.museframework.bian.producttraining.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveServiceDeliveryRequest {
    @MetaField
    private String producttrainingid;

    @MetaField
    private String servicedeliveryid;

    public void setProducttrainingid(String producttrainingid) {
        this.producttrainingid = producttrainingid;
    }

    public String getProducttrainingid() {
        return producttrainingid;
    }

    public void setServicedeliveryid(String servicedeliveryid) {
        this.servicedeliveryid = servicedeliveryid;
    }

    public String getServicedeliveryid() {
        return servicedeliveryid;
    }
}