package org.museframework.bian.carfinset.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateConsolidationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.carfinset.dto.bq.Consolidation consolidation;

    public void setConsolidation(org.museframework.bian.carfinset.dto.bq.Consolidation consolidation) {
        this.consolidation = consolidation;
    }

    public org.museframework.bian.carfinset.dto.bq.Consolidation getConsolidation() {
        return consolidation;
    }
}