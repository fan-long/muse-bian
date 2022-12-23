package org.museframework.bian.customerbilling.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveTrackingandRemindersRequest {
    @MetaField
    private String customerbillingid;

    @MetaField
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