package org.museframework.bian.contacthandler.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteCustomerContactOperatingSessionRequest {
    @MetaField
    private String contacthandlerid;

    @MetaField(ref=true)
    private org.museframework.bian.contacthandler.dto.cr.CustomerContactOperatingSession customerContactOperatingSession;

    public void setContacthandlerid(String contacthandlerid) {
        this.contacthandlerid = contacthandlerid;
    }

    public String getContacthandlerid() {
        return contacthandlerid;
    }

    public void setCustomerContactOperatingSession(org.museframework.bian.contacthandler.dto.cr.CustomerContactOperatingSession customerContactOperatingSession) {
        this.customerContactOperatingSession = customerContactOperatingSession;
    }

    public org.museframework.bian.contacthandler.dto.cr.CustomerContactOperatingSession getCustomerContactOperatingSession() {
        return customerContactOperatingSession;
    }
}