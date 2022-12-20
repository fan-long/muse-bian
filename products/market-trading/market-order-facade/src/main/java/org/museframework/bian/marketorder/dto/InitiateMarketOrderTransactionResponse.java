package org.museframework.bian.marketorder.dto;

public class InitiateMarketOrderTransactionResponse {
    private org.museframework.bian.marketorder.dto.cr.MarketOrderTransaction marketOrderTransaction;

    public void setMarketOrderTransaction(org.museframework.bian.marketorder.dto.cr.MarketOrderTransaction marketOrderTransaction) {
        this.marketOrderTransaction = marketOrderTransaction;
    }

    public org.museframework.bian.marketorder.dto.cr.MarketOrderTransaction getMarketOrderTransaction() {
        return marketOrderTransaction;
    }
}