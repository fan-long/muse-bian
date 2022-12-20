package org.museframework.bian.savingsaccount.dto;

public class RetrieveIssuedDeviceResponse {
    private org.museframework.bian.savingsaccount.dto.bq.IssuedDevice issuedDevice;

    public void setIssuedDevice(org.museframework.bian.savingsaccount.dto.bq.IssuedDevice issuedDevice) {
        this.issuedDevice = issuedDevice;
    }

    public org.museframework.bian.savingsaccount.dto.bq.IssuedDevice getIssuedDevice() {
        return issuedDevice;
    }
}