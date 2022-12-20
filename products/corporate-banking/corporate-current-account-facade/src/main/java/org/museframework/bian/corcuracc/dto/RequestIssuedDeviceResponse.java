package org.museframework.bian.corcuracc.dto;

public class RequestIssuedDeviceResponse {
    private org.museframework.bian.corcuracc.dto.bq.IssuedDevice issuedDevice;

    public void setIssuedDevice(org.museframework.bian.corcuracc.dto.bq.IssuedDevice issuedDevice) {
        this.issuedDevice = issuedDevice;
    }

    public org.museframework.bian.corcuracc.dto.bq.IssuedDevice getIssuedDevice() {
        return issuedDevice;
    }
}