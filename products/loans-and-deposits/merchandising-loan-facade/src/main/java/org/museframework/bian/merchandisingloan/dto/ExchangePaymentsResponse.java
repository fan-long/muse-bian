package org.museframework.bian.merchandisingloan.dto;

public class ExchangePaymentsResponse {
    private org.museframework.bian.merchandisingloan.dto.bq.Payments payments;

    public void setPayments(org.museframework.bian.merchandisingloan.dto.bq.Payments payments) {
        this.payments = payments;
    }

    public org.museframework.bian.merchandisingloan.dto.bq.Payments getPayments() {
        return payments;
    }
}