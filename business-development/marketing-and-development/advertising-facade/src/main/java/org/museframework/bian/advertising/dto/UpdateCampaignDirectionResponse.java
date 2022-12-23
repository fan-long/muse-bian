package org.museframework.bian.advertising.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateCampaignDirectionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.advertising.dto.bq.CampaignDirection campaignDirection;

    public void setCampaignDirection(org.museframework.bian.advertising.dto.bq.CampaignDirection campaignDirection) {
        this.campaignDirection = campaignDirection;
    }

    public org.museframework.bian.advertising.dto.bq.CampaignDirection getCampaignDirection() {
        return campaignDirection;
    }
}