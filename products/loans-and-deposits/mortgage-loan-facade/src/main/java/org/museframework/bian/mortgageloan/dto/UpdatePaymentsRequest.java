package org.museframework.bian.mortgageloan.dto;

public class UpdatePaymentsRequest {
    private String mortgageloanid;

    private String paymentsid;

    private org.museframework.bian.mortgageloan.dto.bq.Payments payments;

    public void setMortgageloanid(String mortgageloanid) {
        this.mortgageloanid = mortgageloanid;
    }

    public String getMortgageloanid() {
        return mortgageloanid;
    }

    public void setPaymentsid(String paymentsid) {
        this.paymentsid = paymentsid;
    }

    public String getPaymentsid() {
        return paymentsid;
    }

    public void setPayments(org.museframework.bian.mortgageloan.dto.bq.Payments payments) {
        this.payments = payments;
    }

    public org.museframework.bian.mortgageloan.dto.bq.Payments getPayments() {
        return payments;
    }
}