package org.museframework.bian.currentaccount.dto;

public class ExecutePaymentsResponse {
    private org.museframework.bian.currentaccount.dto.bq.Payments payments;

    public void setPayments(org.museframework.bian.currentaccount.dto.bq.Payments payments) {
        this.payments = payments;
    }

    public org.museframework.bian.currentaccount.dto.bq.Payments getPayments() {
        return payments;
    }
}