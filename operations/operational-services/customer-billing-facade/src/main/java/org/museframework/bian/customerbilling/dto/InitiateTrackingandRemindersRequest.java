package org.museframework.bian.customerbilling.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateTrackingandRemindersRequest {
    @MetaField
    private String customerbillingid;

    @MetaField
    private String trackingandremindersid;

    @MetaField(ref=true)
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