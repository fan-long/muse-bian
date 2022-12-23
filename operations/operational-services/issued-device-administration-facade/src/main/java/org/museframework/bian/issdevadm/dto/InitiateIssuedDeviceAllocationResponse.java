package org.museframework.bian.issdevadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateIssuedDeviceAllocationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.issdevadm.dto.cr.IssuedDeviceAllocation issuedDeviceAllocation;

    public void setIssuedDeviceAllocation(org.museframework.bian.issdevadm.dto.cr.IssuedDeviceAllocation issuedDeviceAllocation) {
        this.issuedDeviceAllocation = issuedDeviceAllocation;
    }

    public org.museframework.bian.issdevadm.dto.cr.IssuedDeviceAllocation getIssuedDeviceAllocation() {
        return issuedDeviceAllocation;
    }
}