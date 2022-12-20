package org.museframework.bian.quotemanagement.dto;

public class NotifyMarketQuoteSelectionWorkstepResponse {
    private org.museframework.bian.quotemanagement.dto.bq.MarketQuoteSelectionWorkstep marketQuoteSelectionWorkstep;

    public void setMarketQuoteSelectionWorkstep(org.museframework.bian.quotemanagement.dto.bq.MarketQuoteSelectionWorkstep marketQuoteSelectionWorkstep) {
        this.marketQuoteSelectionWorkstep = marketQuoteSelectionWorkstep;
    }

    public org.museframework.bian.quotemanagement.dto.bq.MarketQuoteSelectionWorkstep getMarketQuoteSelectionWorkstep() {
        return marketQuoteSelectionWorkstep;
    }
}