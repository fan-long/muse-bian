package org.museframework.bian.cuscamman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveMarketTrackingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cuscamman.dto.bq.MarketTracking marketTracking;

    public void setMarketTracking(org.museframework.bian.cuscamman.dto.bq.MarketTracking marketTracking) {
        this.marketTracking = marketTracking;
    }

    public org.museframework.bian.cuscamman.dto.bq.MarketTracking getMarketTracking() {
        return marketTracking;
    }
}