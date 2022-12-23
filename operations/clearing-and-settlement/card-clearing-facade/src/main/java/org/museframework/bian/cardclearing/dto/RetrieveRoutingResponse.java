package org.museframework.bian.cardclearing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveRoutingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cardclearing.dto.bq.Routing routing;

    public void setRouting(org.museframework.bian.cardclearing.dto.bq.Routing routing) {
        this.routing = routing;
    }

    public org.museframework.bian.cardclearing.dto.bq.Routing getRouting() {
        return routing;
    }
}