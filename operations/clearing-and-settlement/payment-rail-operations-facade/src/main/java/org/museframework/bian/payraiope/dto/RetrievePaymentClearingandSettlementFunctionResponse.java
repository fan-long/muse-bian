package org.museframework.bian.payraiope.dto;

public class RetrievePaymentClearingandSettlementFunctionResponse {
    private org.museframework.bian.payraiope.dto.bq.PaymentClearingandSettlementFunction paymentClearingandSettlementFunction;

    public void setPaymentClearingandSettlementFunction(org.museframework.bian.payraiope.dto.bq.PaymentClearingandSettlementFunction paymentClearingandSettlementFunction) {
        this.paymentClearingandSettlementFunction = paymentClearingandSettlementFunction;
    }

    public org.museframework.bian.payraiope.dto.bq.PaymentClearingandSettlementFunction getPaymentClearingandSettlementFunction() {
        return paymentClearingandSettlementFunction;
    }
}