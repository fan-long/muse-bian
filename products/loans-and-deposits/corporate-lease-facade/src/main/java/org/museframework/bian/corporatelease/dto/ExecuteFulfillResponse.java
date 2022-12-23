package org.museframework.bian.corporatelease.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteFulfillResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corporatelease.dto.bq.Fulfill fulfill;

    public void setFulfill(org.museframework.bian.corporatelease.dto.bq.Fulfill fulfill) {
        this.fulfill = fulfill;
    }

    public org.museframework.bian.corporatelease.dto.bq.Fulfill getFulfill() {
        return fulfill;
    }
}