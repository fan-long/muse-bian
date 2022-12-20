package org.museframework.bian.leasing.dto;

public class UpdatePaymentsResponse {
    private org.museframework.bian.leasing.dto.bq.Payments payments;

    public void setPayments(org.museframework.bian.leasing.dto.bq.Payments payments) {
        this.payments = payments;
    }

    public org.museframework.bian.leasing.dto.bq.Payments getPayments() {
        return payments;
    }
}