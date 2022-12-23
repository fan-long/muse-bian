package org.museframework.bian.customercase.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCustomerCaseProcedureRequest {
    @MetaField
    private String customercaseid;

    @MetaField(ref=true)
    private org.museframework.bian.customercase.dto.cr.CustomerCaseProcedure customerCaseProcedure;

    public void setCustomercaseid(String customercaseid) {
        this.customercaseid = customercaseid;
    }

    public String getCustomercaseid() {
        return customercaseid;
    }

    public void setCustomerCaseProcedure(org.museframework.bian.customercase.dto.cr.CustomerCaseProcedure customerCaseProcedure) {
        this.customerCaseProcedure = customerCaseProcedure;
    }

    public org.museframework.bian.customercase.dto.cr.CustomerCaseProcedure getCustomerCaseProcedure() {
        return customerCaseProcedure;
    }
}