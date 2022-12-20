package org.museframework.bian.cardauthorization.dto;

public class RetrieveDeviceCheckResponse {
    private org.museframework.bian.cardauthorization.dto.bq.DeviceCheck deviceCheck;

    public void setDeviceCheck(org.museframework.bian.cardauthorization.dto.bq.DeviceCheck deviceCheck) {
        this.deviceCheck = deviceCheck;
    }

    public org.museframework.bian.cardauthorization.dto.bq.DeviceCheck getDeviceCheck() {
        return deviceCheck;
    }
}