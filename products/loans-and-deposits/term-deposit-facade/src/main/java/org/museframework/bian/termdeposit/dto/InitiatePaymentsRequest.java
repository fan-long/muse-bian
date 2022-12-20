package org.museframework.bian.termdeposit.dto;

public class InitiatePaymentsRequest {
    private String termdepositid;

    private String paymentsid;

    private org.museframework.bian.termdeposit.dto.bq.Payments payments;

    public void setTermdepositid(String termdepositid) {
        this.termdepositid = termdepositid;
    }

    public String getTermdepositid() {
        return termdepositid;
    }

    public void setPaymentsid(String paymentsid) {
        this.paymentsid = paymentsid;
    }

    public String getPaymentsid() {
        return paymentsid;
    }

    public void setPayments(org.museframework.bian.termdeposit.dto.bq.Payments payments) {
        this.payments = payments;
    }

    public org.museframework.bian.termdeposit.dto.bq.Payments getPayments() {
        return payments;
    }
}