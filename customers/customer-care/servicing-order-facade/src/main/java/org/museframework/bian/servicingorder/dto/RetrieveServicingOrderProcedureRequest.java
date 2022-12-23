package org.museframework.bian.servicingorder.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveServicingOrderProcedureRequest {
    @MetaField
    private String servicingorderid;

    public void setServicingorderid(String servicingorderid) {
        this.servicingorderid = servicingorderid;
    }

    public String getServicingorderid() {
        return servicingorderid;
    }
}