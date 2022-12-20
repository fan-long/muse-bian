package org.museframework.bian.marordexe.dto;

public class InitiateQuoteRequest {
    private String marketorderexecutionid;

    private String quoteid;

    private org.museframework.bian.marordexe.dto.bq.Quote quote;

    public void setMarketorderexecutionid(String marketorderexecutionid) {
        this.marketorderexecutionid = marketorderexecutionid;
    }

    public String getMarketorderexecutionid() {
        return marketorderexecutionid;
    }

    public void setQuoteid(String quoteid) {
        this.quoteid = quoteid;
    }

    public String getQuoteid() {
        return quoteid;
    }

    public void setQuote(org.museframework.bian.marordexe.dto.bq.Quote quote) {
        this.quote = quote;
    }

    public org.museframework.bian.marordexe.dto.bq.Quote getQuote() {
        return quote;
    }
}