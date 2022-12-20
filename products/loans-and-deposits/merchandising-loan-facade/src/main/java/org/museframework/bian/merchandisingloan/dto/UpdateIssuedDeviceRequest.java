package org.museframework.bian.merchandisingloan.dto;

public class UpdateIssuedDeviceRequest {
    private String merchandisingloanid;

    private String issueddeviceid;

    private org.museframework.bian.merchandisingloan.dto.bq.IssuedDevice issuedDevice;

    public void setMerchandisingloanid(String merchandisingloanid) {
        this.merchandisingloanid = merchandisingloanid;
    }

    public String getMerchandisingloanid() {
        return merchandisingloanid;
    }

    public void setIssueddeviceid(String issueddeviceid) {
        this.issueddeviceid = issueddeviceid;
    }

    public String getIssueddeviceid() {
        return issueddeviceid;
    }

    public void setIssuedDevice(org.museframework.bian.merchandisingloan.dto.bq.IssuedDevice issuedDevice) {
        this.issuedDevice = issuedDevice;
    }

    public org.museframework.bian.merchandisingloan.dto.bq.IssuedDevice getIssuedDevice() {
        return issuedDevice;
    }
}