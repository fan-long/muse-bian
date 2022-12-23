/*The sub-tasks involved in the execution of the financial transaction*/
package org.museframework.bian.marordexe.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class TradeInitiation {
    /*If the market trade is not executed against the bank position, but directly in the wholesale market, this refers to the actual wholesale trading record*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object wholesaleTradeReference;

    /*The tracked and returned processing status of the market trade (e.g. pending, partially complete, complete)*/
    @MetaField
    private String marketTradeTransactionInstanceProcessingStatus;

    /*Details of the market trade initiation task*/
    @MetaField
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