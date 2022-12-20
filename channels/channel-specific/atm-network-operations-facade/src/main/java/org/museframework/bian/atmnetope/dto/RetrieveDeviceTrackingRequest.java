package org.museframework.bian.atmnetope.dto;

public class RetrieveDeviceTrackingRequest {
    private String atmnetworkoperationsid;

    private String devicetrackingid;

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
}