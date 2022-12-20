package org.museframework.bian.corcuracc.dto;

public class ExecutePaymentsResponse {
    private org.museframework.bian.corcuracc.dto.bq.Payments payments;

    public void setPayments(org.museframework.bian.corcuracc.dto.bq.Payments payments) {
        this.payments = payments;
    }

    public org.museframework.bian.corcuracc.dto.bq.Payments getPayments() {
        return payments;
    }
}