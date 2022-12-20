package org.museframework.bian.chaactana.dto;

public class ExecuteDeviceErrorRequest {
    private String channelactivityanalysisid;

    private String deviceerrorid;

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