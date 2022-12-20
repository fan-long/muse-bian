package org.museframework.bian.casmanandaccser.dto;

public class ExecutePaymentsResponse {
    private org.museframework.bian.casmanandaccser.dto.bq.Payments payments;

    public void setPayments(org.museframework.bian.casmanandaccser.dto.bq.Payments payments) {
        this.payments = payments;
    }

    public org.museframework.bian.casmanandaccser.dto.bq.Payments getPayments() {
        return payments;
    }
}