package org.museframework.bian.quotemanagement.dto;

public class RetrieveMarketQuoteSelectionWorkstepRequest {
    private String quotemanagementid;

    private String marketquoteselectionworkstepid;

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
}