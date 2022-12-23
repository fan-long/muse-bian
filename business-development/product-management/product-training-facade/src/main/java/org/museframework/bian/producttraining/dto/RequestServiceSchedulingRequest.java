package org.museframework.bian.producttraining.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestServiceSchedulingRequest {
    @MetaField
    private String producttrainingid;

    @MetaField
    private String serviceschedulingid;

    @MetaField(ref=true)
    private org.museframework.bian.producttraining.dto.bq.ServiceScheduling serviceScheduling;

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

    public void setServiceScheduling(org.museframework.bian.producttraining.dto.bq.ServiceScheduling serviceScheduling) {
        this.serviceScheduling = serviceScheduling;
    }

    public org.museframework.bian.producttraining.dto.bq.ServiceScheduling getServiceScheduling() {
        return serviceScheduling;
    }
}