package org.museframework.bian.marordexe.dto;

public class RetrieveQuoteRequest {
    private String marketorderexecutionid;

    private String quoteid;

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
}