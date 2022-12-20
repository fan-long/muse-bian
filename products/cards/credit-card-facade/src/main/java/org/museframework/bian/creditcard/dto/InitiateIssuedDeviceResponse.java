package org.museframework.bian.creditcard.dto;

public class InitiateIssuedDeviceResponse {
    private org.museframework.bian.creditcard.dto.bq.IssuedDevice issuedDevice;

    public void setIssuedDevice(org.museframework.bian.creditcard.dto.bq.IssuedDevice issuedDevice) {
        this.issuedDevice = issuedDevice;
    }

    public org.museframework.bian.creditcard.dto.bq.IssuedDevice getIssuedDevice() {
        return issuedDevice;
    }
}