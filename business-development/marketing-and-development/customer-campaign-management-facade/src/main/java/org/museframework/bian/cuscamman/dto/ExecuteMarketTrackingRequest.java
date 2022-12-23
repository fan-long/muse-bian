package org.museframework.bian.cuscamman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteMarketTrackingRequest {
    @MetaField
    private String customercampaignmanagementid;

    @MetaField
    private String markettrackingid;

    @MetaField(ref=true)
    private org.museframework.bian.cuscamman.dto.bq.MarketTracking marketTracking;

    public void setCustomercampaignmanagementid(String customercampaignmanagementid) {
        this.customercampaignmanagementid = customercampaignmanagementid;
    }

    public String getCustomercampaignmanagementid() {
        return customercampaignmanagementid;
    }

    public void setMarkettrackingid(String markettrackingid) {
        this.markettrackingid = markettrackingid;
    }

    public String getMarkettrackingid() {
        return markettrackingid;
    }

    public void setMarketTracking(org.museframework.bian.cuscamman.dto.bq.MarketTracking marketTracking) {
        this.marketTracking = marketTracking;
    }

    public org.museframework.bian.cuscamman.dto.bq.MarketTracking getMarketTracking() {
        return marketTracking;
    }
}