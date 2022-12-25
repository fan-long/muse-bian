/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.paymentexecution.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class PaymentMechanism {
    /*Details of the mechanism selection*/
    @MetaField(0)
    private String paymentExecutionTaskResult;

    public void setPaymentExecutionTaskResult(String paymentExecutionTaskResult) {
        this.paymentExecutionTaskResult = paymentExecutionTaskResult;
    }

    public String getPaymentExecutionTaskResult() {
        return paymentExecutionTaskResult;
    }
}