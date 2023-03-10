package org.museframework.bian.quotemanagement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateMarketQuoteRequestWorkstepResponse {
    @MetaField(ref=true)
    private org.museframework.bian.quotemanagement.dto.bq.MarketQuoteRequestWorkstep marketQuoteRequestWorkstep;

    public void setMarketQuoteRequestWorkstep(org.museframework.bian.quotemanagement.dto.bq.MarketQuoteRequestWorkstep marketQuoteRequestWorkstep) {
        this.marketQuoteRequestWorkstep = marketQuoteRequestWorkstep;
    }

    public org.museframework.bian.quotemanagement.dto.bq.MarketQuoteRequestWorkstep getMarketQuoteRequestWorkstep() {
        return marketQuoteRequestWorkstep;
    }
}