package org.museframework.bian.cencashan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureCentralCashAllocationRequest {
    @MetaField
    private String centralcashhandlingid;

    @MetaField(ref=true)
    private org.museframework.bian.cencashan.dto.cr.CentralCashAllocation centralCashAllocation;

    public void setCentralcashhandlingid(String centralcashhandlingid) {
        this.centralcashhandlingid = centralcashhandlingid;
    }

    public String getCentralcashhandlingid() {
        return centralcashhandlingid;
    }

    public void setCentralCashAllocation(org.museframework.bian.cencashan.dto.cr.CentralCashAllocation centralCashAllocation) {
        this.centralCashAllocation = centralCashAllocation;
    }

    public org.museframework.bian.cencashan.dto.cr.CentralCashAllocation getCentralCashAllocation() {
        return centralCashAllocation;
    }
}