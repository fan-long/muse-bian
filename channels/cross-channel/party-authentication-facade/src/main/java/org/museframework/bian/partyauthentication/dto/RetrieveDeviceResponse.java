package org.museframework.bian.partyauthentication.dto;

public class RetrieveDeviceResponse {
    private org.museframework.bian.partyauthentication.dto.bq.Device device;

    public void setDevice(org.museframework.bian.partyauthentication.dto.bq.Device device) {
        this.device = device;
    }

    public org.museframework.bian.partyauthentication.dto.bq.Device getDevice() {
        return device;
    }
}