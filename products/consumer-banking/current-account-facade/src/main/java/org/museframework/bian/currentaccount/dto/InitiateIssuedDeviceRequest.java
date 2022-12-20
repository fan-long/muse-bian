package org.museframework.bian.currentaccount.dto;

public class InitiateIssuedDeviceRequest {
    private String currentaccountid;

    private String issueddeviceid;

    private org.museframework.bian.currentaccount.dto.bq.IssuedDevice issuedDevice;

    public void setCurrentaccountid(String currentaccountid) {
        this.currentaccountid = currentaccountid;
    }

    public String getCurrentaccountid() {
        return currentaccountid;
    }

    public void setIssueddeviceid(String issueddeviceid) {
        this.issueddeviceid = issueddeviceid;
    }

    public String getIssueddeviceid() {
        return issueddeviceid;
    }

    public void setIssuedDevice(org.museframework.bian.currentaccount.dto.bq.IssuedDevice issuedDevice) {
        this.issuedDevice = issuedDevice;
    }

    public org.museframework.bian.currentaccount.dto.bq.IssuedDevice getIssuedDevice() {
        return issuedDevice;
    }
}