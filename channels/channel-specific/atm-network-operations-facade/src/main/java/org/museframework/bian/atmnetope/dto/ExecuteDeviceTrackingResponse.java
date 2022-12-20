package org.museframework.bian.atmnetope.dto;

public class ExecuteDeviceTrackingResponse {
    private org.museframework.bian.atmnetope.dto.bq.DeviceTracking deviceTracking;

    public void setDeviceTracking(org.museframework.bian.atmnetope.dto.bq.DeviceTracking deviceTracking) {
        this.deviceTracking = deviceTracking;
    }

    public org.museframework.bian.atmnetope.dto.bq.DeviceTracking getDeviceTracking() {
        return deviceTracking;
    }
}