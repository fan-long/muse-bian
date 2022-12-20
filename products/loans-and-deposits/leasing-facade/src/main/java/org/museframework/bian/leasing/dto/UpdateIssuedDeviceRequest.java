package org.museframework.bian.leasing.dto;

public class UpdateIssuedDeviceRequest {
    private String leasingid;

    private String issueddeviceid;

    private org.museframework.bian.leasing.dto.bq.IssuedDevice issuedDevice;

    public void setLeasingid(String leasingid) {
        this.leasingid = leasingid;
    }

    public String getLeasingid() {
        return leasingid;
    }

    public void setIssueddeviceid(String issueddeviceid) {
        this.issueddeviceid = issueddeviceid;
    }

    public String getIssueddeviceid() {
        return issueddeviceid;
    }

    public void setIssuedDevice(org.museframework.bian.leasing.dto.bq.IssuedDevice issuedDevice) {
        this.issuedDevice = issuedDevice;
    }

    public org.museframework.bian.leasing.dto.bq.IssuedDevice getIssuedDevice() {
        return issuedDevice;
    }
}