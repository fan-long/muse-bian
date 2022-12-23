package org.museframework.bian.advvoiserman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestCapacityPlanningResponse {
    @MetaField(ref=true)
    private org.museframework.bian.advvoiserman.dto.bq.CapacityPlanning capacityPlanning;

    public void setCapacityPlanning(org.museframework.bian.advvoiserman.dto.bq.CapacityPlanning capacityPlanning) {
        this.capacityPlanning = capacityPlanning;
    }

    public org.museframework.bian.advvoiserman.dto.bq.CapacityPlanning getCapacityPlanning() {
        return capacityPlanning;
    }
}