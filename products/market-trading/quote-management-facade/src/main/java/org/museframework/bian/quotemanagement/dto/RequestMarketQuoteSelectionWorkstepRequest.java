package org.museframework.bian.quotemanagement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestMarketQuoteSelectionWorkstepRequest {
    @MetaField
    private String quotemanagementid;

    @MetaField
    private String marketquoteselectionworkstepid;

    @MetaField(ref=true)
    private org.museframework.bian.quotemanagement.dto.bq.MarketQuoteSelectionWorkstep marketQuoteSelectionWorkstep;

    public void setQuotemanagementid(String quotemanagementid) {
        this.quotemanagementid = quotemanagementid;
    }

    public String getQuotemanagementid() {
        return quotemanagementid;
    }

    public void setMarketquoteselectionworkstepid(String marketquoteselectionworkstepid) {
        this.marketquoteselectionworkstepid = marketquoteselectionworkstepid;
    }

    public String getMarketquoteselectionworkstepid() {
        return marketquoteselectionworkstepid;
    }

    public void setMarketQuoteSelectionWorkstep(org.museframework.bian.quotemanagement.dto.bq.MarketQuoteSelectionWorkstep marketQuoteSelectionWorkstep) {
        this.marketQuoteSelectionWorkstep = marketQuoteSelectionWorkstep;
    }

    public org.museframework.bian.quotemanagement.dto.bq.MarketQuoteSelectionWorkstep getMarketQuoteSelectionWorkstep() {
        return marketQuoteSelectionWorkstep;
    }
}