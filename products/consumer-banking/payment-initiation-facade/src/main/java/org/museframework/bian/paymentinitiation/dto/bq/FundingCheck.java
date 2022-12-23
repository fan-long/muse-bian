/*The sub-tasks involved in the execution of the financial transaction*/
package org.museframework.bian.paymentinitiation.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class FundingCheck extends org.museframework.bian.classes.FundingCheck {
    /*The outcome of the funds available check*/
    @MetaField
    private String paymentTransactionFundingCheckResult;

    public void setPaymentTransactionFundingCheckResult(String paymentTransactionFundingCheckResult) {
        this.paymentTransactionFundingCheckResult = paymentTransactionFundingCheckResult;
    }

    public String getPaymentTransactionFundingCheckResult() {
        return paymentTransactionFundingCheckResult;
    }
}