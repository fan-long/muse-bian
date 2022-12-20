package org.museframework.bian.payraiope.dto;

public class RetrievePaymentAccountReconciliationFunctionResponse {
    private org.museframework.bian.payraiope.dto.bq.PaymentAccountReconciliationFunction paymentAccountReconciliationFunction;

    public void setPaymentAccountReconciliationFunction(org.museframework.bian.payraiope.dto.bq.PaymentAccountReconciliationFunction paymentAccountReconciliationFunction) {
        this.paymentAccountReconciliationFunction = paymentAccountReconciliationFunction;
    }

    public org.museframework.bian.payraiope.dto.bq.PaymentAccountReconciliationFunction getPaymentAccountReconciliationFunction() {
        return paymentAccountReconciliationFunction;
    }
}