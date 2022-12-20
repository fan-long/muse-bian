package org.museframework.bian.quotemanagement.dto;

public class ExchangeMarketQuoteRequestWorkstepRequest {
    private String quotemanagementid;

    private String marketquoterequestworkstepid;

    private org.museframework.bian.quotemanagement.dto.bq.MarketQuoteRequestWorkstep marketQuoteRequestWorkstep;

    public void setQuotemanagementid(String quotemanagementid) {
        this.quotemanagementid = quotemanagementid;
    }

    public String getQuotemanagementid() {
        return quotemanagementid;
    }

    public void setMarketquoterequestworkstepid(String marketquoterequestworkstepid) {
        this.marketquoterequestworkstepid = marketquoterequestworkstepid;
    }

    public String getMarketquoterequestworkstepid() {
        return marketquoterequestworkstepid;
    }

    public void setMarketQuoteRequestWorkstep(org.museframework.bian.quotemanagement.dto.bq.MarketQuoteRequestWorkstep marketQuoteRequestWorkstep) {
        this.marketQuoteRequestWorkstep = marketQuoteRequestWorkstep;
    }

    public org.museframework.bian.quotemanagement.dto.bq.MarketQuoteRequestWorkstep getMarketQuoteRequestWorkstep() {
        return marketQuoteRequestWorkstep;
    }
}