package org.museframework.bian.advertising.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateAdvertisingCampaignManagementPlanResponse {
    @MetaField(ref=true)
    private org.museframework.bian.advertising.dto.cr.AdvertisingCampaignManagementPlan advertisingCampaignManagementPlan;

    public void setAdvertisingCampaignManagementPlan(org.museframework.bian.advertising.dto.cr.AdvertisingCampaignManagementPlan advertisingCampaignManagementPlan) {
        this.advertisingCampaignManagementPlan = advertisingCampaignManagementPlan;
    }

    public org.museframework.bian.advertising.dto.cr.AdvertisingCampaignManagementPlan getAdvertisingCampaignManagementPlan() {
        return advertisingCampaignManagementPlan;
    }
}