package org.museframework.bian.quotemanagement.dto;

public class NotifyMarketQuoteRequestWorkstepRequest {
    private String quotemanagementid;

    private String marketquoterequestworkstepid;

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
}