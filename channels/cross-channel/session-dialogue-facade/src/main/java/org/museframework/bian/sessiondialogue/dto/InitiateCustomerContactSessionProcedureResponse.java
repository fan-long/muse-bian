package org.museframework.bian.sessiondialogue.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateCustomerContactSessionProcedureResponse {
    @MetaField(ref=true)
    private org.museframework.bian.sessiondialogue.dto.cr.CustomerContactSessionProcedure customerContactSessionProcedure;

    public void setCustomerContactSessionProcedure(org.museframework.bian.sessiondialogue.dto.cr.CustomerContactSessionProcedure customerContactSessionProcedure) {
        this.customerContactSessionProcedure = customerContactSessionProcedure;
    }

    public org.museframework.bian.sessiondialogue.dto.cr.CustomerContactSessionProcedure getCustomerContactSessionProcedure() {
        return customerContactSessionProcedure;
    }
}