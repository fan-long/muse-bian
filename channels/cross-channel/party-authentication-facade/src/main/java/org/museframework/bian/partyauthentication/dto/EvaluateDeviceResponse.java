package org.museframework.bian.partyauthentication.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class EvaluateDeviceResponse {
    @MetaField(ref=true)
    private org.museframework.bian.partyauthentication.dto.bq.Device device;

    public void setDevice(org.museframework.bian.partyauthentication.dto.bq.Device device) {
        this.device = device;
    }

    public org.museframework.bian.partyauthentication.dto.bq.Device getDevice() {
        return device;
    }
}