package org.museframework.bian.merchandisingloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateIssuedDeviceResponse {
    @MetaField(ref=true)
    private org.museframework.bian.merchandisingloan.dto.bq.IssuedDevice issuedDevice;

    public void setIssuedDevice(org.museframework.bian.merchandisingloan.dto.bq.IssuedDevice issuedDevice) {
        this.issuedDevice = issuedDevice;
    }

    public org.museframework.bian.merchandisingloan.dto.bq.IssuedDevice getIssuedDevice() {
        return issuedDevice;
    }
}