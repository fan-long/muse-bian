package org.museframework.bian.contactrouting.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ProvideCustomerServicingResourceAllocationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.contactrouting.dto.cr.CustomerServicingResourceAllocation customerServicingResourceAllocation;

    public void setCustomerServicingResourceAllocation(org.museframework.bian.contactrouting.dto.cr.CustomerServicingResourceAllocation customerServicingResourceAllocation) {
        this.customerServicingResourceAllocation = customerServicingResourceAllocation;
    }

    public org.museframework.bian.contactrouting.dto.cr.CustomerServicingResourceAllocation getCustomerServicingResourceAllocation() {
        return customerServicingResourceAllocation;
    }
}