package org.museframework.bian.savingsaccount.dto;

public class UpdateIssuedDeviceRequest {
    private String savingsaccountid;

    private String issueddeviceid;

    private org.museframework.bian.savingsaccount.dto.bq.IssuedDevice issuedDevice;

    public void setSavingsaccountid(String savingsaccountid) {
        this.savingsaccountid = savingsaccountid;
    }

    public String getSavingsaccountid() {
        return savingsaccountid;
    }

    public void setIssueddeviceid(String issueddeviceid) {
        this.issueddeviceid = issueddeviceid;
    }

    public String getIssueddeviceid() {
        return issueddeviceid;
    }

    public void setIssuedDevice(org.museframework.bian.savingsaccount.dto.bq.IssuedDevice issuedDevice) {
        this.issuedDevice = issuedDevice;
    }

    public org.museframework.bian.savingsaccount.dto.bq.IssuedDevice getIssuedDevice() {
        return issuedDevice;
    }
}