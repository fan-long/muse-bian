package org.museframework.bian.cardauthorization.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveDeviceCheckResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cardauthorization.dto.bq.DeviceCheck deviceCheck;

    public void setDeviceCheck(org.museframework.bian.cardauthorization.dto.bq.DeviceCheck deviceCheck) {
        this.deviceCheck = deviceCheck;
    }

    public org.museframework.bian.cardauthorization.dto.bq.DeviceCheck getDeviceCheck() {
        return deviceCheck;
    }
}