package org.museframework.bian.businessdevelopment.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateInitiativeResponse {
    @MetaField(ref=true)
    private org.museframework.bian.businessdevelopment.dto.bq.Initiative initiative;

    public void setInitiative(org.museframework.bian.businessdevelopment.dto.bq.Initiative initiative) {
        this.initiative = initiative;
    }

    public org.museframework.bian.businessdevelopment.dto.bq.Initiative getInitiative() {
        return initiative;
    }
}