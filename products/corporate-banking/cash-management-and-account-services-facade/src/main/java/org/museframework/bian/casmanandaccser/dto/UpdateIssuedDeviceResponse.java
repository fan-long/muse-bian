package org.museframework.bian.casmanandaccser.dto;

public class UpdateIssuedDeviceResponse {
    private org.museframework.bian.casmanandaccser.dto.bq.IssuedDevice issuedDevice;

    public void setIssuedDevice(org.museframework.bian.casmanandaccser.dto.bq.IssuedDevice issuedDevice) {
        this.issuedDevice = issuedDevice;
    }

    public org.museframework.bian.casmanandaccser.dto.bq.IssuedDevice getIssuedDevice() {
        return issuedDevice;
    }
}