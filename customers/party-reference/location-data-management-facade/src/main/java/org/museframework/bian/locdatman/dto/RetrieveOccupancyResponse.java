package org.museframework.bian.locdatman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveOccupancyResponse {
    @MetaField(ref=true)
    private org.museframework.bian.locdatman.dto.bq.Occupancy occupancy;

    public void setOccupancy(org.museframework.bian.locdatman.dto.bq.Occupancy occupancy) {
        this.occupancy = occupancy;
    }

    public org.museframework.bian.locdatman.dto.bq.Occupancy getOccupancy() {
        return occupancy;
    }
}