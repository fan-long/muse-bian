package org.museframework.bian.opeiteman.dto;

public class RetrieveTrackingResponse {
    private org.museframework.bian.opeiteman.dto.bq.Tracking tracking;

    public void setTracking(org.museframework.bian.opeiteman.dto.bq.Tracking tracking) {
        this.tracking = tracking;
    }

    public org.museframework.bian.opeiteman.dto.bq.Tracking getTracking() {
        return tracking;
    }
}