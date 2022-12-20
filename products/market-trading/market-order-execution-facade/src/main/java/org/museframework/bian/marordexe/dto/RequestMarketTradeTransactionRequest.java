package org.museframework.bian.marordexe.dto;

public class RequestMarketTradeTransactionRequest {
    private String marketorderexecutionid;

    private org.museframework.bian.marordexe.dto.cr.MarketTradeTransaction marketTradeTransaction;

    public void setMarketorderexecutionid(String marketorderexecutionid) {
        this.marketorderexecutionid = marketorderexecutionid;
    }

    public String getMarketorderexecutionid() {
        return marketorderexecutionid;
    }

    public void setMarketTradeTransaction(org.museframework.bian.marordexe.dto.cr.MarketTradeTransaction marketTradeTransaction) {
        this.marketTradeTransaction = marketTradeTransaction;
    }

    public org.museframework.bian.marordexe.dto.cr.MarketTradeTransaction getMarketTradeTransaction() {
        return marketTradeTransaction;
    }
}