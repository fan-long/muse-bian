/*The sub-tasks involved in the execution of the financial transaction*/
package org.museframework.bian.marketorder.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class TradeInitiation {
    /*The reference to the market trade. Note this can be the internal bank 'trade' against the bank's managed position and may not result in a matched trade in the wholesale markets*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object marketTradeTransactionInstanceReference;

    /*The returned status of the market trade*/
    @MetaField(0)
    private String marketTradeTransactionInstanceStatus;

    /*Details of the market trade initiation task*/
    @MetaField(0)
    private String marketTradeInitiationTaskResult;

    public void setMarketTradeTransactionInstanceReference(org.museframework.bian.classes.Object marketTradeTransactionInstanceReference) {
        this.marketTradeTransactionInstanceReference = marketTradeTransactionInstanceReference;
    }

    public org.museframework.bian.classes.Object getMarketTradeTransactionInstanceReference() {
        return marketTradeTransactionInstanceReference;
    }

    public void setMarketTradeTransactionInstanceStatus(String marketTradeTransactionInstanceStatus) {
        this.marketTradeTransactionInstanceStatus = marketTradeTransactionInstanceStatus;
    }

    public String getMarketTradeTransactionInstanceStatus() {
        return marketTradeTransactionInstanceStatus;
    }

    public void setMarketTradeInitiationTaskResult(String marketTradeInitiationTaskResult) {
        this.marketTradeInitiationTaskResult = marketTradeInitiationTaskResult;
    }

    public String getMarketTradeInitiationTaskResult() {
        return marketTradeInitiationTaskResult;
    }
}