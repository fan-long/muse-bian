package org.museframework.bian.chaactana.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveDeviceErrorRequest {
    @MetaField
    private String channelactivityanalysisid;

    @MetaField
    private String deviceerrorid;

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
}