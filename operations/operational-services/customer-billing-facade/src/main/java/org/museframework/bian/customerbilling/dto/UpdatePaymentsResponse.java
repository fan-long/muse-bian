package org.museframework.bian.customerbilling.dto;

public class UpdatePaymentsResponse {
    private org.museframework.bian.customerbilling.dto.bq.Payments payments;

    public void setPayments(org.museframework.bian.customerbilling.dto.bq.Payments payments) {
        this.payments = payments;
    }

    public org.museframework.bian.customerbilling.dto.bq.Payments getPayments() {
        return payments;
    }
}