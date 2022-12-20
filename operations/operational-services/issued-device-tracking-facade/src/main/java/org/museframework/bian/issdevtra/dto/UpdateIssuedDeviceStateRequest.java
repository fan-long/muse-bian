package org.museframework.bian.issdevtra.dto;

public class UpdateIssuedDeviceStateRequest {
    private String issueddevicetrackingid;

    private org.museframework.bian.issdevtra.dto.cr.IssuedDeviceState issuedDeviceState;

    public void setIssueddevicetrackingid(String issueddevicetrackingid) {
        this.issueddevicetrackingid = issueddevicetrackingid;
    }

    public String getIssueddevicetrackingid() {
        return issueddevicetrackingid;
    }

    public void setIssuedDeviceState(org.museframework.bian.issdevtra.dto.cr.IssuedDeviceState issuedDeviceState) {
        this.issuedDeviceState = issuedDeviceState;
    }

    public org.museframework.bian.issdevtra.dto.cr.IssuedDeviceState getIssuedDeviceState() {
        return issuedDeviceState;
    }
}