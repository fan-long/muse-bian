package org.museframework.bian.servicingorder.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveServicingOrderProcedureResponse {
    @MetaField(ref=true)
    private org.museframework.bian.servicingorder.dto.cr.ServicingOrderProcedure servicingOrderProcedure;

    public void setServicingOrderProcedure(org.museframework.bian.servicingorder.dto.cr.ServicingOrderProcedure servicingOrderProcedure) {
        this.servicingOrderProcedure = servicingOrderProcedure;
    }

    public org.museframework.bian.servicingorder.dto.cr.ServicingOrderProcedure getServicingOrderProcedure() {
        return servicingOrderProcedure;
    }
}