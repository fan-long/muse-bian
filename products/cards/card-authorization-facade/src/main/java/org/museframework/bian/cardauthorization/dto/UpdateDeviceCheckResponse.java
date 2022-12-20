package org.museframework.bian.cardauthorization.dto;

public class UpdateDeviceCheckResponse {
    private org.museframework.bian.cardauthorization.dto.bq.DeviceCheck deviceCheck;

    public void setDeviceCheck(org.museframework.bian.cardauthorization.dto.bq.DeviceCheck deviceCheck) {
        this.deviceCheck = deviceCheck;
    }

    public org.museframework.bian.cardauthorization.dto.bq.DeviceCheck getDeviceCheck() {
        return deviceCheck;
    }
}