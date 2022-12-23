package org.museframework.bian.atmnetope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveDeviceTrackingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.atmnetope.dto.bq.DeviceTracking deviceTracking;

    public void setDeviceTracking(org.museframework.bian.atmnetope.dto.bq.DeviceTracking deviceTracking) {
        this.deviceTracking = deviceTracking;
    }

    public org.museframework.bian.atmnetope.dto.bq.DeviceTracking getDeviceTracking() {
        return deviceTracking;
    }
}