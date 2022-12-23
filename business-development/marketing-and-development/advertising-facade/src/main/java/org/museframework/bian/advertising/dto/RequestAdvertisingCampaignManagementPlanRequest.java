package org.museframework.bian.advertising.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestAdvertisingCampaignManagementPlanRequest {
    @MetaField
    private String advertisingid;

    @MetaField(ref=true)
    private org.museframework.bian.advertising.dto.cr.AdvertisingCampaignManagementPlan advertisingCampaignManagementPlan;

    public void setAdvertisingid(String advertisingid) {
        this.advertisingid = advertisingid;
    }

    public String getAdvertisingid() {
        return advertisingid;
    }

    public void setAdvertisingCampaignManagementPlan(org.museframework.bian.advertising.dto.cr.AdvertisingCampaignManagementPlan advertisingCampaignManagementPlan) {
        this.advertisingCampaignManagementPlan = advertisingCampaignManagementPlan;
    }

    public org.museframework.bian.advertising.dto.cr.AdvertisingCampaignManagementPlan getAdvertisingCampaignManagementPlan() {
        return advertisingCampaignManagementPlan;
    }
}