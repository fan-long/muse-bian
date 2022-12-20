package org.museframework.bian.savingsaccount.dto;

public class UpdatePaymentsResponse {
    private org.museframework.bian.savingsaccount.dto.bq.Payments payments;

    public void setPayments(org.museframework.bian.savingsaccount.dto.bq.Payments payments) {
        this.payments = payments;
    }

    public org.museframework.bian.savingsaccount.dto.bq.Payments getPayments() {
        return payments;
    }
}