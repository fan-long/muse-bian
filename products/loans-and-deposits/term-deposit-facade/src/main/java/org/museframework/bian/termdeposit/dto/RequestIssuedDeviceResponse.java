package org.museframework.bian.termdeposit.dto;

public class RequestIssuedDeviceResponse {
    private org.museframework.bian.termdeposit.dto.bq.IssuedDevice issuedDevice;

    public void setIssuedDevice(org.museframework.bian.termdeposit.dto.bq.IssuedDevice issuedDevice) {
        this.issuedDevice = issuedDevice;
    }

    public org.museframework.bian.termdeposit.dto.bq.IssuedDevice getIssuedDevice() {
        return issuedDevice;
    }
}