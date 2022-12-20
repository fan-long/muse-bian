package org.museframework.bian.cencashan.dto;

public class RetrieveTrackingandAllocationRequest {
    private String centralcashhandlingid;

    private String trackingandallocationid;

    public void setCentralcashhandlingid(String centralcashhandlingid) {
        this.centralcashhandlingid = centralcashhandlingid;
    }

    public String getCentralcashhandlingid() {
        return centralcashhandlingid;
    }

    public void setTrackingandallocationid(String trackingandallocationid) {
        this.trackingandallocationid = trackingandallocationid;
    }

    public String getTrackingandallocationid() {
        return trackingandallocationid;
    }
}