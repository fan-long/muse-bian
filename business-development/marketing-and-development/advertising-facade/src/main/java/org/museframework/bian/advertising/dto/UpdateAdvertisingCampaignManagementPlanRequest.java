package org.museframework.bian.advertising.dto;

public class UpdateAdvertisingCampaignManagementPlanRequest {
    private String advertisingid;

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