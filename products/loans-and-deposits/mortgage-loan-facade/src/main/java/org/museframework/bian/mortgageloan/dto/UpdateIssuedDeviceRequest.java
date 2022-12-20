package org.museframework.bian.mortgageloan.dto;

public class UpdateIssuedDeviceRequest {
    private String mortgageloanid;

    private String issueddeviceid;

    private org.museframework.bian.mortgageloan.dto.bq.IssuedDevice issuedDevice;

    public void setMortgageloanid(String mortgageloanid) {
        this.mortgageloanid = mortgageloanid;
    }

    public String getMortgageloanid() {
        return mortgageloanid;
    }

    public void setIssueddeviceid(String issueddeviceid) {
        this.issueddeviceid = issueddeviceid;
    }

    public String getIssueddeviceid() {
        return issueddeviceid;
    }

    public void setIssuedDevice(org.museframework.bian.mortgageloan.dto.bq.IssuedDevice issuedDevice) {
        this.issuedDevice = issuedDevice;
    }

    public org.museframework.bian.mortgageloan.dto.bq.IssuedDevice getIssuedDevice() {
        return issuedDevice;
    }
}