package org.museframework.bian.quotemanagement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteMarketQuoteSelectionWorkstepResponse {
    @MetaField(ref=true)
    private org.museframework.bian.quotemanagement.dto.bq.MarketQuoteSelectionWorkstep marketQuoteSelectionWorkstep;

    public void setMarketQuoteSelectionWorkstep(org.museframework.bian.quotemanagement.dto.bq.MarketQuoteSelectionWorkstep marketQuoteSelectionWorkstep) {
        this.marketQuoteSelectionWorkstep = marketQuoteSelectionWorkstep;
    }

    public org.museframework.bian.quotemanagement.dto.bq.MarketQuoteSelectionWorkstep getMarketQuoteSelectionWorkstep() {
        return marketQuoteSelectionWorkstep;
    }
}