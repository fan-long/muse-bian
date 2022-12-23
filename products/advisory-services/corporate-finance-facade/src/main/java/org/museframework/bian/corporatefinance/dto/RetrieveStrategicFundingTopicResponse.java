package org.museframework.bian.corporatefinance.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveStrategicFundingTopicResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corporatefinance.dto.bq.StrategicFundingTopic strategicFundingTopic;

    public void setStrategicFundingTopic(org.museframework.bian.corporatefinance.dto.bq.StrategicFundingTopic strategicFundingTopic) {
        this.strategicFundingTopic = strategicFundingTopic;
    }

    public org.museframework.bian.corporatefinance.dto.bq.StrategicFundingTopic getStrategicFundingTopic() {
        return strategicFundingTopic;
    }
}