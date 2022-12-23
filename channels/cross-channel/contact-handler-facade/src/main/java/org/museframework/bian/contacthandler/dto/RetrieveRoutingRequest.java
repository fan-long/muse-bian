package org.museframework.bian.contacthandler.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveRoutingRequest {
    @MetaField
    private String contacthandlerid;

    @MetaField
    private String routingid;

    public void setContacthandlerid(String contacthandlerid) {
        this.contacthandlerid = contacthandlerid;
    }

    public String getContacthandlerid() {
        return contacthandlerid;
    }

    public void setRoutingid(String routingid) {
        this.routingid = routingid;
    }

    public String getRoutingid() {
        return routingid;
    }
}