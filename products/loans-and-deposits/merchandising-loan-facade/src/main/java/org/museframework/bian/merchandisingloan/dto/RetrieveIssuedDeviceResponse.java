package org.museframework.bian.merchandisingloan.dto;

public class RetrieveIssuedDeviceResponse {
    private org.museframework.bian.merchandisingloan.dto.bq.IssuedDevice issuedDevice;

    public void setIssuedDevice(org.museframework.bian.merchandisingloan.dto.bq.IssuedDevice issuedDevice) {
        this.issuedDevice = issuedDevice;
    }

    public org.museframework.bian.merchandisingloan.dto.bq.IssuedDevice getIssuedDevice() {
        return issuedDevice;
    }
}