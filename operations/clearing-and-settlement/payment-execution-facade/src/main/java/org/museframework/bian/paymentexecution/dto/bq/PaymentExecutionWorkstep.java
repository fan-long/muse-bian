/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.paymentexecution.dto.bq;

public class PaymentExecutionWorkstep {
    /*Details of the execution transaction*/
    private String paymentExecutionTaskResult;

    public void setPaymentExecutionTaskResult(String paymentExecutionTaskResult) {
        this.paymentExecutionTaskResult = paymentExecutionTaskResult;
    }

    public String getPaymentExecutionTaskResult() {
        return paymentExecutionTaskResult;
    }
}