package org.museframework.bian.creditcard.dto;

public class UpdateIssuedDeviceRequest {
    private String creditcardid;

    private String issueddeviceid;

    private org.museframework.bian.creditcard.dto.bq.IssuedDevice issuedDevice;

    public void setCreditcardid(String creditcardid) {
        this.creditcardid = creditcardid;
    }

    public String getCreditcardid() {
        return creditcardid;
    }

    public void setIssueddeviceid(String issueddeviceid) {
        this.issueddeviceid = issueddeviceid;
    }

    public String getIssueddeviceid() {
        return issueddeviceid;
    }

    public void setIssuedDevice(org.museframework.bian.creditcard.dto.bq.IssuedDevice issuedDevice) {
        this.issuedDevice = issuedDevice;
    }

    public org.museframework.bian.creditcard.dto.bq.IssuedDevice getIssuedDevice() {
        return issuedDevice;
    }
}