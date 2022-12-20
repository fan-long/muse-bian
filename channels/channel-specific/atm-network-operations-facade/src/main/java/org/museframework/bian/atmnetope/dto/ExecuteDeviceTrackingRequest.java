package org.museframework.bian.atmnetope.dto;

public class ExecuteDeviceTrackingRequest {
    private String atmnetworkoperationsid;

    private String devicetrackingid;

    private org.museframework.bian.atmnetope.dto.bq.DeviceTracking deviceTracking;

    public void setAtmnetworkoperationsid(String atmnetworkoperationsid) {
        this.atmnetworkoperationsid = atmnetworkoperationsid;
    }

    public String getAtmnetworkoperationsid() {
        return atmnetworkoperationsid;
    }

    public void setDevicetrackingid(String devicetrackingid) {
        this.devicetrackingid = devicetrackingid;
    }

    public String getDevicetrackingid() {
        return devicetrackingid;
    }

    public void setDeviceTracking(org.museframework.bian.atmnetope.dto.bq.DeviceTracking deviceTracking) {
        this.deviceTracking = deviceTracking;
    }

    public org.museframework.bian.atmnetope.dto.bq.DeviceTracking getDeviceTracking() {
        return deviceTracking;
    }
}