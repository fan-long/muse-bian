package org.museframework.bian.servicingissue.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteServicingIssueProcedureResponse {
    @MetaField(ref=true)
    private org.museframework.bian.servicingissue.dto.cr.ServicingIssueProcedure servicingIssueProcedure;

    public void setServicingIssueProcedure(org.museframework.bian.servicingissue.dto.cr.ServicingIssueProcedure servicingIssueProcedure) {
        this.servicingIssueProcedure = servicingIssueProcedure;
    }

    public org.museframework.bian.servicingissue.dto.cr.ServicingIssueProcedure getServicingIssueProcedure() {
        return servicingIssueProcedure;
    }
}