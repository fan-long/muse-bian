package org.museframework.bian.corporatefinance.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateTacticalFundingTopicResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corporatefinance.dto.bq.TacticalFundingTopic tacticalFundingTopic;

    public void setTacticalFundingTopic(org.museframework.bian.corporatefinance.dto.bq.TacticalFundingTopic tacticalFundingTopic) {
        this.tacticalFundingTopic = tacticalFundingTopic;
    }

    public org.museframework.bian.corporatefinance.dto.bq.TacticalFundingTopic getTacticalFundingTopic() {
        return tacticalFundingTopic;
    }
}