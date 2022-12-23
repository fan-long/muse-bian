package org.museframework.bian.cencashan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateCentralCashAllocationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cencashan.dto.cr.CentralCashAllocation centralCashAllocation;

    public void setCentralCashAllocation(org.museframework.bian.cencashan.dto.cr.CentralCashAllocation centralCashAllocation) {
        this.centralCashAllocation = centralCashAllocation;
    }

    public org.museframework.bian.cencashan.dto.cr.CentralCashAllocation getCentralCashAllocation() {
        return centralCashAllocation;
    }
}