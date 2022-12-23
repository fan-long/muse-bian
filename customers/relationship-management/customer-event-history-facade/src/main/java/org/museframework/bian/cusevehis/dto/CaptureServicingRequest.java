package org.museframework.bian.cusevehis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureServicingRequest {
    @MetaField
    private String customereventhistoryid;

    @MetaField
    private String servicingid;

    @MetaField(ref=true)
    private org.museframework.bian.cusevehis.dto.bq.Servicing servicing;

    public void setCustomereventhistoryid(String customereventhistoryid) {
        this.customereventhistoryid = customereventhistoryid;
    }

    public String getCustomereventhistoryid() {
        return customereventhistoryid;
    }

    public void setServicingid(String servicingid) {
        this.servicingid = servicingid;
    }

    public String getServicingid() {
        return servicingid;
    }

    public void setServicing(org.museframework.bian.cusevehis.dto.bq.Servicing servicing) {
        this.servicing = servicing;
    }

    public org.museframework.bian.cusevehis.dto.bq.Servicing getServicing() {
        return servicing;
    }
}