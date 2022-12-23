package org.museframework.bian.marordexe.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestPositionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.marordexe.dto.bq.Position position;

    public void setPosition(org.museframework.bian.marordexe.dto.bq.Position position) {
        this.position = position;
    }

    public org.museframework.bian.marordexe.dto.bq.Position getPosition() {
        return position;
    }
}