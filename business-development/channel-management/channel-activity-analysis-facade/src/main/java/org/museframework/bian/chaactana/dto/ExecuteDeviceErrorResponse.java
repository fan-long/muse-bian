package org.museframework.bian.chaactana.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteDeviceErrorResponse {
    @MetaField(ref=true)
    private org.museframework.bian.chaactana.dto.bq.DeviceError deviceError;

    public void setDeviceError(org.museframework.bian.chaactana.dto.bq.DeviceError deviceError) {
        this.deviceError = deviceError;
    }

    public org.museframework.bian.chaactana.dto.bq.DeviceError getDeviceError() {
        return deviceError;
    }
}