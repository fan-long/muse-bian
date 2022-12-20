package org.museframework.bian.currentaccount.dto;

public class RetrieveIssuedDeviceResponse {
    private org.museframework.bian.currentaccount.dto.bq.IssuedDevice issuedDevice;

    public void setIssuedDevice(org.museframework.bian.currentaccount.dto.bq.IssuedDevice issuedDevice) {
        this.issuedDevice = issuedDevice;
    }

    public org.museframework.bian.currentaccount.dto.bq.IssuedDevice getIssuedDevice() {
        return issuedDevice;
    }
}