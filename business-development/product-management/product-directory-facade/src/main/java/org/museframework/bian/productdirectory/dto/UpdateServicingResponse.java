package org.museframework.bian.productdirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateServicingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.productdirectory.dto.bq.Servicing servicing;

    public void setServicing(org.museframework.bian.productdirectory.dto.bq.Servicing servicing) {
        this.servicing = servicing;
    }

    public org.museframework.bian.productdirectory.dto.bq.Servicing getServicing() {
        return servicing;
    }
}