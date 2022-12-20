package org.museframework.bian.termdeposit.dto;

public class UpdateIssuedDeviceRequest {
    private String termdepositid;

    private String issueddeviceid;

    private org.museframework.bian.termdeposit.dto.bq.IssuedDevice issuedDevice;

    public void setTermdepositid(String termdepositid) {
        this.termdepositid = termdepositid;
    }

    public String getTermdepositid() {
        return termdepositid;
    }

    public void setIssueddeviceid(String issueddeviceid) {
        this.issueddeviceid = issueddeviceid;
    }

    public String getIssueddeviceid() {
        return issueddeviceid;
    }

    public void setIssuedDevice(org.museframework.bian.termdeposit.dto.bq.IssuedDevice issuedDevice) {
        this.issuedDevice = issuedDevice;
    }

    public org.museframework.bian.termdeposit.dto.bq.IssuedDevice getIssuedDevice() {
        return issuedDevice;
    }
}