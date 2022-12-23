package org.museframework.bian.corcuracc.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateIssuedDeviceResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corcuracc.dto.bq.IssuedDevice issuedDevice;

    public void setIssuedDevice(org.museframework.bian.corcuracc.dto.bq.IssuedDevice issuedDevice) {
        this.issuedDevice = issuedDevice;
    }

    public org.museframework.bian.corcuracc.dto.bq.IssuedDevice getIssuedDevice() {
        return issuedDevice;
    }
}