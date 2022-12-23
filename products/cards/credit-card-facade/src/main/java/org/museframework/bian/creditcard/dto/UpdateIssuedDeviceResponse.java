package org.museframework.bian.creditcard.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateIssuedDeviceResponse {
    @MetaField(ref=true)
    private org.museframework.bian.creditcard.dto.bq.IssuedDevice issuedDevice;

    public void setIssuedDevice(org.museframework.bian.creditcard.dto.bq.IssuedDevice issuedDevice) {
        this.issuedDevice = issuedDevice;
    }

    public org.museframework.bian.creditcard.dto.bq.IssuedDevice getIssuedDevice() {
        return issuedDevice;
    }
}