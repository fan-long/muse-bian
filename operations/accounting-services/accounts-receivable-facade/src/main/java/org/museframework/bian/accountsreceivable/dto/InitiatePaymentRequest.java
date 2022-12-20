package org.museframework.bian.accountsreceivable.dto;

public class InitiatePaymentRequest {
    private String accountsreceivableid;

    private String paymentid;

    private org.museframework.bian.accountsreceivable.dto.bq.Payment payment;

    public void setAccountsreceivableid(String accountsreceivableid) {
        this.accountsreceivableid = accountsreceivableid;
    }

    public String getAccountsreceivableid() {
        return accountsreceivableid;
    }

    public void setPaymentid(String paymentid) {
        this.paymentid = paymentid;
    }

    public String getPaymentid() {
        return paymentid;
    }

    public void setPayment(org.museframework.bian.accountsreceivable.dto.bq.Payment payment) {
        this.payment = payment;
    }

    public org.museframework.bian.accountsreceivable.dto.bq.Payment getPayment() {
        return payment;
    }
}