package org.museframework.bian.orderallocation.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class NotifyUpdate_PartiallyCompleted_MarketOrderWorkstepResponse {
    @MetaField(ref=true)
    private org.museframework.bian.orderallocation.dto.bq.Update_PartiallyCompleted_MarketOrderWorkstep update_PartiallyCompleted_MarketOrderWorkstep;

    public void setUpdate_PartiallyCompleted_MarketOrderWorkstep(org.museframework.bian.orderallocation.dto.bq.Update_PartiallyCompleted_MarketOrderWorkstep update_PartiallyCompleted_MarketOrderWorkstep) {
        this.update_PartiallyCompleted_MarketOrderWorkstep = update_PartiallyCompleted_MarketOrderWorkstep;
    }

    public org.museframework.bian.orderallocation.dto.bq.Update_PartiallyCompleted_MarketOrderWorkstep getUpdate_PartiallyCompleted_MarketOrderWorkstep() {
        return update_PartiallyCompleted_MarketOrderWorkstep;
    }
}