package org.museframework.bian.assetsecuritization.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangePlacementResponse {
    @MetaField(ref=true)
    private org.museframework.bian.assetsecuritization.dto.bq.Placement placement;

    public void setPlacement(org.museframework.bian.assetsecuritization.dto.bq.Placement placement) {
        this.placement = placement;
    }

    public org.museframework.bian.assetsecuritization.dto.bq.Placement getPlacement() {
        return placement;
    }
}