package org.museframework.bian.cardcollections.dto;

public class RetrievePaymentTermsResponse {
    private org.museframework.bian.cardcollections.dto.bq.PaymentTerms paymentTerms;

    public void setPaymentTerms(org.museframework.bian.cardcollections.dto.bq.PaymentTerms paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    public org.museframework.bian.cardcollections.dto.bq.PaymentTerms getPaymentTerms() {
        return paymentTerms;
    }
}