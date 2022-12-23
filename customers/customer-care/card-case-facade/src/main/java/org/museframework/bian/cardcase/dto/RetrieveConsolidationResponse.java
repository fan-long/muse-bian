package org.museframework.bian.cardcase.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveConsolidationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cardcase.dto.bq.Consolidation consolidation;

    public void setConsolidation(org.museframework.bian.cardcase.dto.bq.Consolidation consolidation) {
        this.consolidation = consolidation;
    }

    public org.museframework.bian.cardcase.dto.bq.Consolidation getConsolidation() {
        return consolidation;
    }
}