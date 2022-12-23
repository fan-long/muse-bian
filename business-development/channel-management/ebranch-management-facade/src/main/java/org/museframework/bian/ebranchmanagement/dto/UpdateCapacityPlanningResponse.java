package org.museframework.bian.ebranchmanagement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateCapacityPlanningResponse {
    @MetaField(ref=true)
    private org.museframework.bian.ebranchmanagement.dto.bq.CapacityPlanning capacityPlanning;

    public void setCapacityPlanning(org.museframework.bian.ebranchmanagement.dto.bq.CapacityPlanning capacityPlanning) {
        this.capacityPlanning = capacityPlanning;
    }

    public org.museframework.bian.ebranchmanagement.dto.bq.CapacityPlanning getCapacityPlanning() {
        return capacityPlanning;
    }
}