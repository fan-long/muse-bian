package org.museframework.bian.savingsaccount.dto;

public class ExecutePaymentsRequest {
    private String savingsaccountid;

    private String paymentsid;

    private org.museframework.bian.savingsaccount.dto.bq.Payments payments;

    public void setSavingsaccountid(String savingsaccountid) {
        this.savingsaccountid = savingsaccountid;
    }

    public String getSavingsaccountid() {
        return savingsaccountid;
    }

    public void setPaymentsid(String paymentsid) {
        this.paymentsid = paymentsid;
    }

    public String getPaymentsid() {
        return paymentsid;
    }

    public void setPayments(org.museframework.bian.savingsaccount.dto.bq.Payments payments) {
        this.payments = payments;
    }

    public org.museframework.bian.savingsaccount.dto.bq.Payments getPayments() {
        return payments;
    }
}