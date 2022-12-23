package org.museframework.bian.customercase.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateCustomerCaseProcedureResponse {
    @MetaField(ref=true)
    private org.museframework.bian.customercase.dto.cr.CustomerCaseProcedure customerCaseProcedure;

    public void setCustomerCaseProcedure(org.museframework.bian.customercase.dto.cr.CustomerCaseProcedure customerCaseProcedure) {
        this.customerCaseProcedure = customerCaseProcedure;
    }

    public org.museframework.bian.customercase.dto.cr.CustomerCaseProcedure getCustomerCaseProcedure() {
        return customerCaseProcedure;
    }
}