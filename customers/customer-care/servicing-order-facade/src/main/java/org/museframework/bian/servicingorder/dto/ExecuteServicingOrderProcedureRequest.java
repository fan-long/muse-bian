package org.museframework.bian.servicingorder.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteServicingOrderProcedureRequest {
    @MetaField
    private String servicingorderid;

    @MetaField(ref=true)
    private org.museframework.bian.servicingorder.dto.cr.ServicingOrderProcedure servicingOrderProcedure;

    public void setServicingorderid(String servicingorderid) {
        this.servicingorderid = servicingorderid;
    }

    public String getServicingorderid() {
        return servicingorderid;
    }

    public void setServicingOrderProcedure(org.museframework.bian.servicingorder.dto.cr.ServicingOrderProcedure servicingOrderProcedure) {
        this.servicingOrderProcedure = servicingOrderProcedure;
    }

    public org.museframework.bian.servicingorder.dto.cr.ServicingOrderProcedure getServicingOrderProcedure() {
        return servicingOrderProcedure;
    }
}