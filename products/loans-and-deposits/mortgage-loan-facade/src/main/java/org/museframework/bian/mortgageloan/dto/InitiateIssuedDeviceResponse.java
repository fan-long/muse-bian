package org.museframework.bian.mortgageloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateIssuedDeviceResponse {
    @MetaField(ref=true)
    private org.museframework.bian.mortgageloan.dto.bq.IssuedDevice issuedDevice;

    public void setIssuedDevice(org.museframework.bian.mortgageloan.dto.bq.IssuedDevice issuedDevice) {
        this.issuedDevice = issuedDevice;
    }

    public org.museframework.bian.mortgageloan.dto.bq.IssuedDevice getIssuedDevice() {
        return issuedDevice;
    }
}