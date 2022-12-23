package org.museframework.bian.cardauthorization.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveStandInResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cardauthorization.dto.bq.StandIn standIn;

    public void setStandIn(org.museframework.bian.cardauthorization.dto.bq.StandIn standIn) {
        this.standIn = standIn;
    }

    public org.museframework.bian.cardauthorization.dto.bq.StandIn getStandIn() {
        return standIn;
    }
}