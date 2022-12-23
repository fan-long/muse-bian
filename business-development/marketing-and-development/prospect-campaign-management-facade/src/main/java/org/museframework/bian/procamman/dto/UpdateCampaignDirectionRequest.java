package org.museframework.bian.procamman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCampaignDirectionRequest {
    @MetaField
    private String prospectcampaignmanagementid;

    @MetaField
    private String campaigndirectionid;

    @MetaField(ref=true)
    private org.museframework.bian.procamman.dto.bq.CampaignDirection campaignDirection;

    public void setProspectcampaignmanagementid(String prospectcampaignmanagementid) {
        this.prospectcampaignmanagementid = prospectcampaignmanagementid;
    }

    public String getProspectcampaignmanagementid() {
        return prospectcampaignmanagementid;
    }

    public void setCampaigndirectionid(String campaigndirectionid) {
        this.campaigndirectionid = campaigndirectionid;
    }

    public String getCampaigndirectionid() {
        return campaigndirectionid;
    }

    public void setCampaignDirection(org.museframework.bian.procamman.dto.bq.CampaignDirection campaignDirection) {
        this.campaignDirection = campaignDirection;
    }

    public org.museframework.bian.procamman.dto.bq.CampaignDirection getCampaignDirection() {
        return campaignDirection;
    }
}