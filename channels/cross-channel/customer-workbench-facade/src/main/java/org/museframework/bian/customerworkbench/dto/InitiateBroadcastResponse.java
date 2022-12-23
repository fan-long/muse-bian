package org.museframework.bian.customerworkbench.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateBroadcastResponse {
    @MetaField(ref=true)
    private org.museframework.bian.customerworkbench.dto.bq.Broadcast broadcast;

    public void setBroadcast(org.museframework.bian.customerworkbench.dto.bq.Broadcast broadcast) {
        this.broadcast = broadcast;
    }

    public org.museframework.bian.customerworkbench.dto.bq.Broadcast getBroadcast() {
        return broadcast;
    }
}