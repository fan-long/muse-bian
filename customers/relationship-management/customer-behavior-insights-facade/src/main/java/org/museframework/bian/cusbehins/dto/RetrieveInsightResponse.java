package org.museframework.bian.cusbehins.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveInsightResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cusbehins.dto.bq.Insight insight;

    public void setInsight(org.museframework.bian.cusbehins.dto.bq.Insight insight) {
        this.insight = insight;
    }

    public org.museframework.bian.cusbehins.dto.bq.Insight getInsight() {
        return insight;
    }
}