package org.museframework.bian.accountsreceivable.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateResolutionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.accountsreceivable.dto.bq.Resolution resolution;

    public void setResolution(org.museframework.bian.accountsreceivable.dto.bq.Resolution resolution) {
        this.resolution = resolution;
    }

    public org.museframework.bian.accountsreceivable.dto.bq.Resolution getResolution() {
        return resolution;
    }
}