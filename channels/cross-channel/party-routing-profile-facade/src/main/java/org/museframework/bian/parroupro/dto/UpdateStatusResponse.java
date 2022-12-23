package org.museframework.bian.parroupro.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateStatusResponse {
    @MetaField(ref=true)
    private org.museframework.bian.parroupro.dto.bq.Status status;

    public void setStatus(org.museframework.bian.parroupro.dto.bq.Status status) {
        this.status = status;
    }

    public org.museframework.bian.parroupro.dto.bq.Status getStatus() {
        return status;
    }
}