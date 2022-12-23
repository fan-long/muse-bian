package org.museframework.bian.regulatoryreporting.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveConsolidationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.regulatoryreporting.dto.bq.Consolidation consolidation;

    public void setConsolidation(org.museframework.bian.regulatoryreporting.dto.bq.Consolidation consolidation) {
        this.consolidation = consolidation;
    }

    public org.museframework.bian.regulatoryreporting.dto.bq.Consolidation getConsolidation() {
        return consolidation;
    }
}