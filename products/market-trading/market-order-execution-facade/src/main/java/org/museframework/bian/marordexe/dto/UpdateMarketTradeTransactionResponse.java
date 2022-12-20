package org.museframework.bian.marordexe.dto;

public class UpdateMarketTradeTransactionResponse {
    private org.museframework.bian.marordexe.dto.cr.MarketTradeTransaction marketTradeTransaction;

    public void setMarketTradeTransaction(org.museframework.bian.marordexe.dto.cr.MarketTradeTransaction marketTradeTransaction) {
        this.marketTradeTransaction = marketTradeTransaction;
    }

    public org.museframework.bian.marordexe.dto.cr.MarketTradeTransaction getMarketTradeTransaction() {
        return marketTradeTransaction;
    }
}