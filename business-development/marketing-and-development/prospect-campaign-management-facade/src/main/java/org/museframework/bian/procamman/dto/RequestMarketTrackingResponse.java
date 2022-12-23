package org.museframework.bian.procamman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestMarketTrackingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.procamman.dto.bq.MarketTracking marketTracking;

    public void setMarketTracking(org.museframework.bian.procamman.dto.bq.MarketTracking marketTracking) {
        this.marketTracking = marketTracking;
    }

    public org.museframework.bian.procamman.dto.bq.MarketTracking getMarketTracking() {
        return marketTracking;
    }
}