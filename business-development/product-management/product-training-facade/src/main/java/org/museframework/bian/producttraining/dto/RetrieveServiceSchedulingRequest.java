package org.museframework.bian.producttraining.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveServiceSchedulingRequest {
    @MetaField
    private String producttrainingid;

    @MetaField
    private String serviceschedulingid;

    public void setProducttrainingid(String producttrainingid) {
        this.producttrainingid = producttrainingid;
    }

    public String getProducttrainingid() {
        return producttrainingid;
    }

    public void setServiceschedulingid(String serviceschedulingid) {
        this.serviceschedulingid = serviceschedulingid;
    }

    public String getServiceschedulingid() {
        return serviceschedulingid;
    }
}