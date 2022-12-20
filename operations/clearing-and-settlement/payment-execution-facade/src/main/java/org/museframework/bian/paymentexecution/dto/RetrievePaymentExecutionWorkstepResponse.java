package org.museframework.bian.paymentexecution.dto;

public class RetrievePaymentExecutionWorkstepResponse {
    private org.museframework.bian.paymentexecution.dto.bq.PaymentExecutionWorkstep paymentExecutionWorkstep;

    public void setPaymentExecutionWorkstep(org.museframework.bian.paymentexecution.dto.bq.PaymentExecutionWorkstep paymentExecutionWorkstep) {
        this.paymentExecutionWorkstep = paymentExecutionWorkstep;
    }

    public org.museframework.bian.paymentexecution.dto.bq.PaymentExecutionWorkstep getPaymentExecutionWorkstep() {
        return paymentExecutionWorkstep;
    }
}