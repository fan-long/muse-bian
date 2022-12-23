package org.museframework.bian.contacthandler.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveRoutingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.contacthandler.dto.bq.Routing routing;

    public void setRouting(org.museframework.bian.contacthandler.dto.bq.Routing routing) {
        this.routing = routing;
    }

    public org.museframework.bian.contacthandler.dto.bq.Routing getRouting() {
        return routing;
    }
}