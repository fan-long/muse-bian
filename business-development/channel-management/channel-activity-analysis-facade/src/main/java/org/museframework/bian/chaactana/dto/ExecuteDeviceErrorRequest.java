package org.museframework.bian.chaactana.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteDeviceErrorRequest {
    @MetaField
    private String channelactivityanalysisid;

    @MetaField
    private String deviceerrorid;

    @MetaField(ref=true)
    private org.museframework.bian.chaactana.dto.bq.DeviceError deviceError;

    public void setChannelactivityanalysisid(String channelactivityanalysisid) {
        this.channelactivityanalysisid = channelactivityanalysisid;
    }

    public String getChannelactivityanalysisid() {
        return channelactivityanalysisid;
    }

    public void setDeviceerrorid(String deviceerrorid) {
        this.deviceerrorid = deviceerrorid;
    }

    public String getDeviceerrorid() {
        return deviceerrorid;
    }

    public void setDeviceError(org.museframework.bian.chaactana.dto.bq.DeviceError deviceError) {
        this.deviceError = deviceError;
    }

    public org.museframework.bian.chaactana.dto.bq.DeviceError getDeviceError() {
        return deviceError;
    }
}