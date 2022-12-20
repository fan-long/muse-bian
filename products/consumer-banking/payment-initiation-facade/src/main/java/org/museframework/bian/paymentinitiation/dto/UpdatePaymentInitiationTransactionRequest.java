package org.museframework.bian.paymentinitiation.dto;

public class UpdatePaymentInitiationTransactionRequest {
    private String paymentinitiationid;

    private org.museframework.bian.paymentinitiation.dto.cr.PaymentInitiationTransaction paymentInitiationTransaction;

    public void setPaymentinitiationid(String paymentinitiationid) {
        this.paymentinitiationid = paymentinitiationid;
    }

    public String getPaymentinitiationid() {
        return paymentinitiationid;
    }

    public void setPaymentInitiationTransaction(org.museframework.bian.paymentinitiation.dto.cr.PaymentInitiationTransaction paymentInitiationTransaction) {
        this.paymentInitiationTransaction = paymentInitiationTransaction;
    }

    public org.museframework.bian.paymentinitiation.dto.cr.PaymentInitiationTransaction getPaymentInitiationTransaction() {
        return paymentInitiationTransaction;
    }
}