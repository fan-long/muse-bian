package org.museframework.bian.procamman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class CreateCampaignDirectionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.procamman.dto.bq.CampaignDirection campaignDirection;

    public void setCampaignDirection(org.museframework.bian.procamman.dto.bq.CampaignDirection campaignDirection) {
        this.campaignDirection = campaignDirection;
    }

    public org.museframework.bian.procamman.dto.bq.CampaignDirection getCampaignDirection() {
        return campaignDirection;
    }
}