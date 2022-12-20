package org.museframework.bian.cardauthorization.dto;

public class UpdateDeviceCheckRequest {
    private String cardauthorizationid;

    private String devicecheckid;

    private org.museframework.bian.cardauthorization.dto.bq.DeviceCheck deviceCheck;

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

    public void setDeviceCheck(org.museframework.bian.cardauthorization.dto.bq.DeviceCheck deviceCheck) {
        this.deviceCheck = deviceCheck;
    }

    public org.museframework.bian.cardauthorization.dto.bq.DeviceCheck getDeviceCheck() {
        return deviceCheck;
    }
}