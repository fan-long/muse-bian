package org.museframework.bian.mortgageloan.dto;

public class ExchangePaymentsResponse {
    private org.museframework.bian.mortgageloan.dto.bq.Payments payments;

    public void setPayments(org.museframework.bian.mortgageloan.dto.bq.Payments payments) {
        this.payments = payments;
    }

    public org.museframework.bian.mortgageloan.dto.bq.Payments getPayments() {
        return payments;
    }
}