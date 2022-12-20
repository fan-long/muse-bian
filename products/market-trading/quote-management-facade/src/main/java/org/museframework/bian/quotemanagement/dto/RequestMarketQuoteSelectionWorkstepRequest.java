package org.museframework.bian.quotemanagement.dto;

public class RequestMarketQuoteSelectionWorkstepRequest {
    private String quotemanagementid;

    private String marketquoteselectionworkstepid;

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