package org.museframework.bian.corcuracc.dto;

public class InitiateIssuedDeviceResponse {
    private org.museframework.bian.corcuracc.dto.bq.IssuedDevice issuedDevice;

    public void setIssuedDevice(org.museframework.bian.corcuracc.dto.bq.IssuedDevice issuedDevice) {
        this.issuedDevice = issuedDevice;
    }

    public org.museframework.bian.corcuracc.dto.bq.IssuedDevice getIssuedDevice() {
        return issuedDevice;
    }
}