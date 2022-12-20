package org.museframework.bian.partyauthentication.dto;

public class EvaluateDeviceRequest {
    private String partyauthenticationid;

    private String deviceid;

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