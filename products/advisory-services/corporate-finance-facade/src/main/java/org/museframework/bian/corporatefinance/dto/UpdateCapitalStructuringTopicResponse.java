package org.museframework.bian.corporatefinance.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateCapitalStructuringTopicResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corporatefinance.dto.bq.CapitalStructuringTopic capitalStructuringTopic;

    public void setCapitalStructuringTopic(org.museframework.bian.corporatefinance.dto.bq.CapitalStructuringTopic capitalStructuringTopic) {
        this.capitalStructuringTopic = capitalStructuringTopic;
    }

    public org.museframework.bian.corporatefinance.dto.bq.CapitalStructuringTopic getCapitalStructuringTopic() {
        return capitalStructuringTopic;
    }
}