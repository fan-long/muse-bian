package org.museframework.bian.contactrouting.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveAllocationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.contactrouting.dto.bq.Allocation allocation;

    public void setAllocation(org.museframework.bian.contactrouting.dto.bq.Allocation allocation) {
        this.allocation = allocation;
    }

    public org.museframework.bian.contactrouting.dto.bq.Allocation getAllocation() {
        return allocation;
    }
}