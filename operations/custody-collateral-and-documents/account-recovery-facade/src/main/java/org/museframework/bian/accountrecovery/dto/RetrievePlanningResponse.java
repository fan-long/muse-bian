package org.museframework.bian.accountrecovery.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrievePlanningResponse {
    @MetaField(ref=true)
    private org.museframework.bian.accountrecovery.dto.bq.Planning planning;

    public void setPlanning(org.museframework.bian.accountrecovery.dto.bq.Planning planning) {
        this.planning = planning;
    }

    public org.museframework.bian.accountrecovery.dto.bq.Planning getPlanning() {
        return planning;
    }
}