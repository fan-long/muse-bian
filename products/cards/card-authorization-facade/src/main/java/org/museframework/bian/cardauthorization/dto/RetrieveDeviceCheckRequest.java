package org.museframework.bian.cardauthorization.dto;

public class RetrieveDeviceCheckRequest {
    private String cardauthorizationid;

    private String devicecheckid;

    public void setCardauthorizationid(String cardauthorizationid) {
        this.cardauthorizationid = cardauthorizationid;
    }

    public String getCardauthorizationid() {
        return cardauthorizationid;
    }

    public void setDevicecheckid(String devicecheckid) {
        this.devicecheckid = devicecheckid;
    }

    public String getDevicecheckid() {
        return devicecheckid;
    }
}