package org.museframework.bian.producttraining.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteServiceSchedulingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.producttraining.dto.bq.ServiceScheduling serviceScheduling;

    public void setServiceScheduling(org.museframework.bian.producttraining.dto.bq.ServiceScheduling serviceScheduling) {
        this.serviceScheduling = serviceScheduling;
    }

    public org.museframework.bian.producttraining.dto.bq.ServiceScheduling getServiceScheduling() {
        return serviceScheduling;
    }
}