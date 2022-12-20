package org.museframework.bian.issdevtra.dto;

public class RetrieveIssuedDeviceStateResponse {
    private org.museframework.bian.issdevtra.dto.cr.IssuedDeviceState issuedDeviceState;

    public void setIssuedDeviceState(org.museframework.bian.issdevtra.dto.cr.IssuedDeviceState issuedDeviceState) {
        this.issuedDeviceState = issuedDeviceState;
    }

    public org.museframework.bian.issdevtra.dto.cr.IssuedDeviceState getIssuedDeviceState() {
        return issuedDeviceState;
    }
}