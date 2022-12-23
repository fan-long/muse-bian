package org.museframework.bian.issdevtra.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateIssuedDeviceStateResponse {
    @MetaField(ref=true)
    private org.museframework.bian.issdevtra.dto.cr.IssuedDeviceState issuedDeviceState;

    public void setIssuedDeviceState(org.museframework.bian.issdevtra.dto.cr.IssuedDeviceState issuedDeviceState) {
        this.issuedDeviceState = issuedDeviceState;
    }

    public org.museframework.bian.issdevtra.dto.cr.IssuedDeviceState getIssuedDeviceState() {
        return issuedDeviceState;
    }
}