package org.museframework.bian.contactrouting.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateAllocationRequest {
    @MetaField
    private String contactroutingid;

    @MetaField
    private String allocationid;

    @MetaField(ref=true)
    private org.museframework.bian.contactrouting.dto.bq.Allocation allocation;

    public void setContactroutingid(String contactroutingid) {
        this.contactroutingid = contactroutingid;
    }

    public String getContactroutingid() {
        return contactroutingid;
    }

    public void setAllocationid(String allocationid) {
        this.allocationid = allocationid;
    }

    public String getAllocationid() {
        return allocationid;
    }

    public void setAllocation(org.museframework.bian.contactrouting.dto.bq.Allocation allocation) {
        this.allocation = allocation;
    }

    public org.museframework.bian.contactrouting.dto.bq.Allocation getAllocation() {
        return allocation;
    }
}