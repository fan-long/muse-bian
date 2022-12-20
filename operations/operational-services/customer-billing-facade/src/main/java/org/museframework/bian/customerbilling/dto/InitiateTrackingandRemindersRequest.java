package org.museframework.bian.customerbilling.dto;

public class InitiateTrackingandRemindersRequest {
    private String customerbillingid;

    private String trackingandremindersid;

    private org.museframework.bian.customerbilling.dto.bq.TrackingandReminders trackingandReminders;

    public void setCustomerbillingid(String customerbillingid) {
        this.customerbillingid = customerbillingid;
    }

    public String getCustomerbillingid() {
        return customerbillingid;
    }

    public void setTrackingandremindersid(String trackingandremindersid) {
        this.trackingandremindersid = trackingandremindersid;
    }

    public String getTrackingandremindersid() {
        return trackingandremindersid;
    }

    public void setTrackingandReminders(org.museframework.bian.customerbilling.dto.bq.TrackingandReminders trackingandReminders) {
        this.trackingandReminders = trackingandReminders;
    }

    public org.museframework.bian.customerbilling.dto.bq.TrackingandReminders getTrackingandReminders() {
        return trackingandReminders;
    }
}