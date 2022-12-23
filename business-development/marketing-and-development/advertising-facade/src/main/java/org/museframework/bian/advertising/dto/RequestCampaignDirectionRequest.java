package org.museframework.bian.advertising.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestCampaignDirectionRequest {
    @MetaField
    private String advertisingid;

    @MetaField
    private String campaigndirectionid;

    @MetaField(ref=true)
    private org.museframework.bian.advertising.dto.bq.CampaignDirection campaignDirection;

    public void setAdvertisingid(String advertisingid) {
        this.advertisingid = advertisingid;
    }

    public String getAdvertisingid() {
        return advertisingid;
    }

    public void setCampaigndirectionid(String campaigndirectionid) {
        this.campaigndirectionid = campaigndirectionid;
    }

    public String getCampaigndirectionid() {
        return campaigndirectionid;
    }

    public void setCampaignDirection(org.museframework.bian.advertising.dto.bq.CampaignDirection campaignDirection) {
        this.campaignDirection = campaignDirection;
    }

    public org.museframework.bian.advertising.dto.bq.CampaignDirection getCampaignDirection() {
        return campaignDirection;
    }
}