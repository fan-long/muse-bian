package org.museframework.bian.servicingissue.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestServicingIssueProcedureRequest {
    @MetaField
    private String servicingissueid;

    @MetaField(ref=true)
    private org.museframework.bian.servicingissue.dto.cr.ServicingIssueProcedure servicingIssueProcedure;

    public void setServicingissueid(String servicingissueid) {
        this.servicingissueid = servicingissueid;
    }

    public String getServicingissueid() {
        return servicingissueid;
    }

    public void setServicingIssueProcedure(org.museframework.bian.servicingissue.dto.cr.ServicingIssueProcedure servicingIssueProcedure) {
        this.servicingIssueProcedure = servicingIssueProcedure;
    }

    public org.museframework.bian.servicingissue.dto.cr.ServicingIssueProcedure getServicingIssueProcedure() {
        return servicingIssueProcedure;
    }
}