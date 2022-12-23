package org.museframework.bian.contactrouting.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureCustomerServicingResourceAllocationRequest {
    @MetaField
    private String contactroutingid;

    @MetaField(ref=true)
    private org.museframework.bian.contactrouting.dto.cr.CustomerServicingResourceAllocation customerServicingResourceAllocation;

    public void setContactroutingid(String contactroutingid) {
        this.contactroutingid = contactroutingid;
    }

    public String getContactroutingid() {
        return contactroutingid;
    }

    public void setCustomerServicingResourceAllocation(org.museframework.bian.contactrouting.dto.cr.CustomerServicingResourceAllocation customerServicingResourceAllocation) {
        this.customerServicingResourceAllocation = customerServicingResourceAllocation;
    }

    public org.museframework.bian.contactrouting.dto.cr.CustomerServicingResourceAllocation getCustomerServicingResourceAllocation() {
        return customerServicingResourceAllocation;
    }
}