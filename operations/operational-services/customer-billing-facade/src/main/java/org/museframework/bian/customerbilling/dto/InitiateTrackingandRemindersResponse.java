package org.museframework.bian.customerbilling.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateTrackingandRemindersResponse {
    @MetaField(ref=true)
    private org.museframework.bian.customerbilling.dto.bq.TrackingandReminders trackingandReminders;

    public void setTrackingandReminders(org.museframework.bian.customerbilling.dto.bq.TrackingandReminders trackingandReminders) {
        this.trackingandReminders = trackingandReminders;
    }

    public org.museframework.bian.customerbilling.dto.bq.TrackingandReminders getTrackingandReminders() {
        return trackingandReminders;
    }
}