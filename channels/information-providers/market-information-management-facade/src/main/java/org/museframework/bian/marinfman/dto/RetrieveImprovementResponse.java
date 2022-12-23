package org.museframework.bian.marinfman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveImprovementResponse {
    @MetaField(ref=true)
    private org.museframework.bian.marinfman.dto.bq.Improvement improvement;

    public void setImprovement(org.museframework.bian.marinfman.dto.bq.Improvement improvement) {
        this.improvement = improvement;
    }

    public org.museframework.bian.marinfman.dto.bq.Improvement getImprovement() {
        return improvement;
    }
}