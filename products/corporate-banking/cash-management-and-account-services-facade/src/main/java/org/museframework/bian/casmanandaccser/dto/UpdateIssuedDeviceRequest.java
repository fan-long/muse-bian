package org.museframework.bian.casmanandaccser.dto;

public class UpdateIssuedDeviceRequest {
    private String cashmanagementandaccountservicesid;

    private String issueddeviceid;

    private org.museframework.bian.casmanandaccser.dto.bq.IssuedDevice issuedDevice;

    public void setCashmanagementandaccountservicesid(String cashmanagementandaccountservicesid) {
        this.cashmanagementandaccountservicesid = cashmanagementandaccountservicesid;
    }

    public String getCashmanagementandaccountservicesid() {
        return cashmanagementandaccountservicesid;
    }

    public void setIssueddeviceid(String issueddeviceid) {
        this.issueddeviceid = issueddeviceid;
    }

    public String getIssueddeviceid() {
        return issueddeviceid;
    }

    public void setIssuedDevice(org.museframework.bian.casmanandaccser.dto.bq.IssuedDevice issuedDevice) {
        this.issuedDevice = issuedDevice;
    }

    public org.museframework.bian.casmanandaccser.dto.bq.IssuedDevice getIssuedDevice() {
        return issuedDevice;
    }
}