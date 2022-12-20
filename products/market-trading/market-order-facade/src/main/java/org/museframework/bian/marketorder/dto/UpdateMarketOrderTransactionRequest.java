package org.museframework.bian.marketorder.dto;

public class UpdateMarketOrderTransactionRequest {
    private String marketorderid;

    private org.museframework.bian.marketorder.dto.cr.MarketOrderTransaction marketOrderTransaction;

    public void setMarketorderid(String marketorderid) {
        this.marketorderid = marketorderid;
    }

    public String getMarketorderid() {
        return marketorderid;
    }

    public void setMarketOrderTransaction(org.museframework.bian.marketorder.dto.cr.MarketOrderTransaction marketOrderTransaction) {
        this.marketOrderTransaction = marketOrderTransaction;
    }

    public org.museframework.bian.marketorder.dto.cr.MarketOrderTransaction getMarketOrderTransaction() {
        return marketOrderTransaction;
    }
}