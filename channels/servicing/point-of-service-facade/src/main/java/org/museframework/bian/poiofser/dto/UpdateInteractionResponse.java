package org.museframework.bian.poiofser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateInteractionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.poiofser.dto.bq.Interaction interaction;

    public void setInteraction(org.museframework.bian.poiofser.dto.bq.Interaction interaction) {
        this.interaction = interaction;
    }

    public org.museframework.bian.poiofser.dto.bq.Interaction getInteraction() {
        return interaction;
    }
}