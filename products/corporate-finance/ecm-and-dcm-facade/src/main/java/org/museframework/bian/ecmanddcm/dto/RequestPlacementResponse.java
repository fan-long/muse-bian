package org.museframework.bian.ecmanddcm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestPlacementResponse {
    @MetaField(ref=true)
    private org.museframework.bian.ecmanddcm.dto.bq.Placement placement;

    public void setPlacement(org.museframework.bian.ecmanddcm.dto.bq.Placement placement) {
        this.placement = placement;
    }

    public org.museframework.bian.ecmanddcm.dto.bq.Placement getPlacement() {
        return placement;
    }
}