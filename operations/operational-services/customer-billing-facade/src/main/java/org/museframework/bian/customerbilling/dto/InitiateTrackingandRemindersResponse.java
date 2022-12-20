package org.museframework.bian.customerbilling.dto;

public class InitiateTrackingandRemindersResponse {
    private org.museframework.bian.customerbilling.dto.bq.TrackingandReminders trackingandReminders;

    public void setTrackingandReminders(org.museframework.bian.customerbilling.dto.bq.TrackingandReminders trackingandReminders) {
        this.trackingandReminders = trackingandReminders;
    }

    public org.museframework.bian.customerbilling.dto.bq.TrackingandReminders getTrackingandReminders() {
        return trackingandReminders;
    }
}