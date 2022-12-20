package org.museframework.bian.customerbilling.dto;

public class RetrieveTrackingandRemindersRequest {
    private String customerbillingid;

    private String trackingandremindersid;

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
}