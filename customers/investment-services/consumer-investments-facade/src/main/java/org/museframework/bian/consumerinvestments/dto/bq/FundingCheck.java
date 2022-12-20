/*The sub-tasks involved in the execution of the financial transaction*/
package org.museframework.bian.consumerinvestments.dto.bq;

public class FundingCheck extends org.museframework.bian.classes.FundingCheck {
    /*The outcome of the funds available check*/
    private String consumerSecuritiesOrderTransactionFundingCheckResult;

    public void setConsumerSecuritiesOrderTransactionFundingCheckResult(String consumerSecuritiesOrderTransactionFundingCheckResult) {
        this.consumerSecuritiesOrderTransactionFundingCheckResult = consumerSecuritiesOrderTransactionFundingCheckResult;
    }

    public String getConsumerSecuritiesOrderTransactionFundingCheckResult() {
        return consumerSecuritiesOrderTransactionFundingCheckResult;
    }
}