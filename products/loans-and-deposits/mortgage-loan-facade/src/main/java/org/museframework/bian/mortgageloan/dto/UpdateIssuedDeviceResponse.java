package org.museframework.bian.mortgageloan.dto;

public class UpdateIssuedDeviceResponse {
    private org.museframework.bian.mortgageloan.dto.bq.IssuedDevice issuedDevice;

    public void setIssuedDevice(org.museframework.bian.mortgageloan.dto.bq.IssuedDevice issuedDevice) {
        this.issuedDevice = issuedDevice;
    }

    public org.museframework.bian.mortgageloan.dto.bq.IssuedDevice getIssuedDevice() {
        return issuedDevice;
    }
}