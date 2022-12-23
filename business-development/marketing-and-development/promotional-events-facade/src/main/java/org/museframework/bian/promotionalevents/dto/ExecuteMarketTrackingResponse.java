package org.museframework.bian.promotionalevents.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteMarketTrackingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.promotionalevents.dto.bq.MarketTracking marketTracking;

    public void setMarketTracking(org.museframework.bian.promotionalevents.dto.bq.MarketTracking marketTracking) {
        this.marketTracking = marketTracking;
    }

    public org.museframework.bian.promotionalevents.dto.bq.MarketTracking getMarketTracking() {
        return marketTracking;
    }
}