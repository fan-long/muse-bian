package org.museframework.bian.savingsaccount.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestIssuedDeviceResponse {
    @MetaField(ref=true)
    private org.museframework.bian.savingsaccount.dto.bq.IssuedDevice issuedDevice;

    public void setIssuedDevice(org.museframework.bian.savingsaccount.dto.bq.IssuedDevice issuedDevice) {
        this.issuedDevice = issuedDevice;
    }

    public org.museframework.bian.savingsaccount.dto.bq.IssuedDevice getIssuedDevice() {
        return issuedDevice;
    }
}