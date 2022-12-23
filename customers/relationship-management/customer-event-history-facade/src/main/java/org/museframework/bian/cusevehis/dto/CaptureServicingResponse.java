package org.museframework.bian.cusevehis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class CaptureServicingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cusevehis.dto.bq.Servicing servicing;

    public void setServicing(org.museframework.bian.cusevehis.dto.bq.Servicing servicing) {
        this.servicing = servicing;
    }

    public org.museframework.bian.cusevehis.dto.bq.Servicing getServicing() {
        return servicing;
    }
}