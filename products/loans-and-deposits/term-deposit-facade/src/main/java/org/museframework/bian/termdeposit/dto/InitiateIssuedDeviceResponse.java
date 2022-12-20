package org.museframework.bian.termdeposit.dto;

public class InitiateIssuedDeviceResponse {
    private org.museframework.bian.termdeposit.dto.bq.IssuedDevice issuedDevice;

    public void setIssuedDevice(org.museframework.bian.termdeposit.dto.bq.IssuedDevice issuedDevice) {
        this.issuedDevice = issuedDevice;
    }

    public org.museframework.bian.termdeposit.dto.bq.IssuedDevice getIssuedDevice() {
        return issuedDevice;
    }
}