package org.museframework.bian.termdeposit.dto;

public class InitiatePaymentsResponse {
    private org.museframework.bian.termdeposit.dto.bq.Payments payments;

    public void setPayments(org.museframework.bian.termdeposit.dto.bq.Payments payments) {
        this.payments = payments;
    }

    public org.museframework.bian.termdeposit.dto.bq.Payments getPayments() {
        return payments;
    }
}