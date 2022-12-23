package org.museframework.bian.colallman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateAllocationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.colallman.dto.bq.Allocation allocation;

    public void setAllocation(org.museframework.bian.colallman.dto.bq.Allocation allocation) {
        this.allocation = allocation;
    }

    public org.museframework.bian.colallman.dto.bq.Allocation getAllocation() {
        return allocation;
    }
}