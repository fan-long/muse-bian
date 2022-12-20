package org.museframework.bian.accountsreceivable.dto;

public class RetrievePaymentResponse {
    private org.museframework.bian.accountsreceivable.dto.bq.Payment payment;

    public void setPayment(org.museframework.bian.accountsreceivable.dto.bq.Payment payment) {
        this.payment = payment;
    }

    public org.museframework.bian.accountsreceivable.dto.bq.Payment getPayment() {
        return payment;
    }
}