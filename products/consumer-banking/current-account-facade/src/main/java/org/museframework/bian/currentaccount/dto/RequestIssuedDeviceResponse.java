package org.museframework.bian.currentaccount.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestIssuedDeviceResponse {
    @MetaField(ref=true)
    private org.museframework.bian.currentaccount.dto.bq.IssuedDevice issuedDevice;

    public void setIssuedDevice(org.museframework.bian.currentaccount.dto.bq.IssuedDevice issuedDevice) {
        this.issuedDevice = issuedDevice;
    }

    public org.museframework.bian.currentaccount.dto.bq.IssuedDevice getIssuedDevice() {
        return issuedDevice;
    }
}