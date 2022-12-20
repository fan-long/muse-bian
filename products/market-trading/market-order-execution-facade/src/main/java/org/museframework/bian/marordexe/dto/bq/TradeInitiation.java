/*The sub-tasks involved in the execution of the financial transaction*/
package org.museframework.bian.marordexe.dto.bq;

public class TradeInitiation {
    /*If the market trade is not executed against the bank position, but directly in the wholesale market, this refers to the actual wholesale trading record*/
    private org.museframework.bian.classes.Object wholesaleTradeReference;

    /*The tracked and returned processing status of the market trade (e.g. pending, partially complete, complete)*/
    private String marketTradeTransactionInstanceProcessingStatus;

    /*Details of the market trade initiation task*/
    private String marketTradeInitiationTaskResult;

    public void setWholesaleTradeReference(org.museframework.bian.classes.Object wholesaleTradeReference) {
        this.wholesaleTradeReference = wholesaleTradeReference;
    }

    public org.museframework.bian.classes.Object getWholesaleTradeReference() {
        return wholesaleTradeReference;
    }

    public void setMarketTradeTransactionInstanceProcessingStatus(String marketTradeTransactionInstanceProcessingStatus) {
        this.marketTradeTransactionInstanceProcessingStatus = marketTradeTransactionInstanceProcessingStatus;
    }

    public String getMarketTradeTransactionInstanceProcessingStatus() {
        return marketTradeTransactionInstanceProcessingStatus;
    }

    public void setMarketTradeInitiationTaskResult(String marketTradeInitiationTaskResult) {
        this.marketTradeInitiationTaskResult = marketTradeInitiationTaskResult;
    }

    public String getMarketTradeInitiationTaskResult() {
        return marketTradeInitiationTaskResult;
    }
}