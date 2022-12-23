package org.museframework.bian.sessiondialogue.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCustomerContactSessionProcedureRequest {
    @MetaField
    private String sessiondialogueid;

    @MetaField(ref=true)
    private org.museframework.bian.sessiondialogue.dto.cr.CustomerContactSessionProcedure customerContactSessionProcedure;

    public void setSessiondialogueid(String sessiondialogueid) {
        this.sessiondialogueid = sessiondialogueid;
    }

    public String getSessiondialogueid() {
        return sessiondialogueid;
    }

    public void setCustomerContactSessionProcedure(org.museframework.bian.sessiondialogue.dto.cr.CustomerContactSessionProcedure customerContactSessionProcedure) {
        this.customerContactSessionProcedure = customerContactSessionProcedure;
    }

    public org.museframework.bian.sessiondialogue.dto.cr.CustomerContactSessionProcedure getCustomerContactSessionProcedure() {
        return customerContactSessionProcedure;
    }
}