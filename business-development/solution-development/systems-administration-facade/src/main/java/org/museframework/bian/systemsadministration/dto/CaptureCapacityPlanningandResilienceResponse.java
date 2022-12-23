package org.museframework.bian.systemsadministration.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class CaptureCapacityPlanningandResilienceResponse {
    @MetaField(ref=true)
    private org.museframework.bian.systemsadministration.dto.bq.CapacityPlanningandResilience capacityPlanningandResilience;

    public void setCapacityPlanningandResilience(org.museframework.bian.systemsadministration.dto.bq.CapacityPlanningandResilience capacityPlanningandResilience) {
        this.capacityPlanningandResilience = capacityPlanningandResilience;
    }

    public org.museframework.bian.systemsadministration.dto.bq.CapacityPlanningandResilience getCapacityPlanningandResilience() {
        return capacityPlanningandResilience;
    }
}