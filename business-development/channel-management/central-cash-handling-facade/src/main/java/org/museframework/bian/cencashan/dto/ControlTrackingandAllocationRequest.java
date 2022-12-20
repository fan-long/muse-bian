package org.museframework.bian.cencashan.dto;

public class ControlTrackingandAllocationRequest {
    private String centralcashhandlingid;

    private String trackingandallocationid;

    private org.museframework.bian.cencashan.dto.bq.TrackingandAllocation trackingandAllocation;

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

    public void setTrackingandAllocation(org.museframework.bian.cencashan.dto.bq.TrackingandAllocation trackingandAllocation) {
        this.trackingandAllocation = trackingandAllocation;
    }

    public org.museframework.bian.cencashan.dto.bq.TrackingandAllocation getTrackingandAllocation() {
        return trackingandAllocation;
    }
}