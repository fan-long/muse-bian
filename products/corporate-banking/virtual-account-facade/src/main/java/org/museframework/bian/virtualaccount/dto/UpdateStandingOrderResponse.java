package org.museframework.bian.virtualaccount.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateStandingOrderResponse {
    @MetaField(ref=true)
    private org.museframework.bian.virtualaccount.dto.bq.StandingOrder standingOrder;

    public void setStandingOrder(org.museframework.bian.virtualaccount.dto.bq.StandingOrder standingOrder) {
        this.standingOrder = standingOrder;
    }

    public org.museframework.bian.virtualaccount.dto.bq.StandingOrder getStandingOrder() {
        return standingOrder;
    }
}