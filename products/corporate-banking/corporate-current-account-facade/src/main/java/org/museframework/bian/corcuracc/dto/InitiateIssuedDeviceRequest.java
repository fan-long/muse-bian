package org.museframework.bian.corcuracc.dto;

public class InitiateIssuedDeviceRequest {
    private String corporatecurrentaccountid;

    private String issueddeviceid;

    private org.museframework.bian.corcuracc.dto.bq.IssuedDevice issuedDevice;

    public void setCorporatecurrentaccountid(String corporatecurrentaccountid) {
        this.corporatecurrentaccountid = corporatecurrentaccountid;
    }

    public String getCorporatecurrentaccountid() {
        return corporatecurrentaccountid;
    }

    public void setIssueddeviceid(String issueddeviceid) {
        this.issueddeviceid = issueddeviceid;
    }

    public String getIssueddeviceid() {
        return issueddeviceid;
    }

    public void setIssuedDevice(org.museframework.bian.corcuracc.dto.bq.IssuedDevice issuedDevice) {
        this.issuedDevice = issuedDevice;
    }

    public org.museframework.bian.corcuracc.dto.bq.IssuedDevice getIssuedDevice() {
        return issuedDevice;
    }
}