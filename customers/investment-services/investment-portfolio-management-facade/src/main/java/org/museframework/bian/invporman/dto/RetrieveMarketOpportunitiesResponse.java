package org.museframework.bian.invporman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveMarketOpportunitiesResponse {
    @MetaField(ref=true)
    private org.museframework.bian.invporman.dto.bq.MarketOpportunities marketOpportunities;

    public void setMarketOpportunities(org.museframework.bian.invporman.dto.bq.MarketOpportunities marketOpportunities) {
        this.marketOpportunities = marketOpportunities;
    }

    public org.museframework.bian.invporman.dto.bq.MarketOpportunities getMarketOpportunities() {
        return marketOpportunities;
    }
}