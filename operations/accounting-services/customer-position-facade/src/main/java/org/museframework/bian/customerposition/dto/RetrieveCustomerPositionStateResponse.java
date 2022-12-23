package org.museframework.bian.customerposition.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveCustomerPositionStateResponse {
    @MetaField(ref=true)
    private org.museframework.bian.customerposition.dto.cr.CustomerPositionState customerPositionState;

    public void setCustomerPositionState(org.museframework.bian.customerposition.dto.cr.CustomerPositionState customerPositionState) {
        this.customerPositionState = customerPositionState;
    }

    public org.museframework.bian.customerposition.dto.cr.CustomerPositionState getCustomerPositionState() {
        return customerPositionState;
    }
}