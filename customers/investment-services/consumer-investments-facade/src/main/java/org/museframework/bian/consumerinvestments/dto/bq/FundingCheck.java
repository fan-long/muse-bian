/*The sub-tasks involved in the execution of the financial transaction*/
package org.museframework.bian.consumerinvestments.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.FundingCheck
@MetaDto
public class FundingCheck {
    /*The outcome of the funds available check*/
    @MetaField(0)
    private String consumerSecuritiesOrderTransactionFundingCheckResult;

    public void setConsumerSecuritiesOrderTransactionFundingCheckResult(String consumerSecuritiesOrderTransactionFundingCheckResult) {
        this.consumerSecuritiesOrderTransactionFundingCheckResult = consumerSecuritiesOrderTransactionFundingCheckResult;
    }

    public String getConsumerSecuritiesOrderTransactionFundingCheckResult() {
        return consumerSecuritiesOrderTransactionFundingCheckResult;
    }
}