/*The sub-tasks involved in the execution of the financial transaction*/
package org.museframework.bian.marketorder.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class FundingCheck extends org.museframework.bian.classes.FundingCheck {
    /*The outcome of the funds available check*/
    @MetaField
    private String marketOrderTransactionFundingCheckResult;

    public void setMarketOrderTransactionFundingCheckResult(String marketOrderTransactionFundingCheckResult) {
        this.marketOrderTransactionFundingCheckResult = marketOrderTransactionFundingCheckResult;
    }

    public String getMarketOrderTransactionFundingCheckResult() {
        return marketOrderTransactionFundingCheckResult;
    }
}