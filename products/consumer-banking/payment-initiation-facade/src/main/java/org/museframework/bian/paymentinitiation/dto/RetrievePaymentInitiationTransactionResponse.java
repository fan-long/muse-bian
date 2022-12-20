package org.museframework.bian.paymentinitiation.dto;

public class RetrievePaymentInitiationTransactionResponse {
    private org.museframework.bian.paymentinitiation.dto.cr.PaymentInitiationTransaction paymentInitiationTransaction;

    public void setPaymentInitiationTransaction(org.museframework.bian.paymentinitiation.dto.cr.PaymentInitiationTransaction paymentInitiationTransaction) {
        this.paymentInitiationTransaction = paymentInitiationTransaction;
    }

    public org.museframework.bian.paymentinitiation.dto.cr.PaymentInitiationTransaction getPaymentInitiationTransaction() {
        return paymentInitiationTransaction;
    }
}