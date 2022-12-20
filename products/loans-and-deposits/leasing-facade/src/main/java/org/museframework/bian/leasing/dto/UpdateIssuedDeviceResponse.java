package org.museframework.bian.leasing.dto;

public class UpdateIssuedDeviceResponse {
    private org.museframework.bian.leasing.dto.bq.IssuedDevice issuedDevice;

    public void setIssuedDevice(org.museframework.bian.leasing.dto.bq.IssuedDevice issuedDevice) {
        this.issuedDevice = issuedDevice;
    }

    public org.museframework.bian.leasing.dto.bq.IssuedDevice getIssuedDevice() {
        return issuedDevice;
    }
}