package org.museframework.bian.partyauthentication.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class EvaluateDeviceRequest {
    @MetaField
    private String partyauthenticationid;

    @MetaField
    private String deviceid;

    @MetaField(ref=true)
    private org.museframework.bian.partyauthentication.dto.bq.Device device;

    public void setPartyauthenticationid(String partyauthenticationid) {
        this.partyauthenticationid = partyauthenticationid;
    }

    public String getPartyauthenticationid() {
        return partyauthenticationid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid;
    }

    public String getDeviceid() {
        return deviceid;
    }

    public void setDevice(org.museframework.bian.partyauthentication.dto.bq.Device device) {
        this.device = device;
    }

    public org.museframework.bian.partyauthentication.dto.bq.Device getDevice() {
        return device;
    }
}