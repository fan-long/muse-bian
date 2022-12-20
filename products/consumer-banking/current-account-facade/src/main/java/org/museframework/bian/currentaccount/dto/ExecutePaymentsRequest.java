package org.museframework.bian.currentaccount.dto;

public class ExecutePaymentsRequest {
    private String currentaccountid;

    private String paymentsid;

    private org.museframework.bian.currentaccount.dto.bq.Payments payments;

    public void setCurrentaccountid(String currentaccountid) {
        this.currentaccountid = currentaccountid;
    }

    public String getCurrentaccountid() {
        return currentaccountid;
    }

    public void setPaymentsid(String paymentsid) {
        this.paymentsid = paymentsid;
    }

    public String getPaymentsid() {
        return paymentsid;
    }

    public void setPayments(org.museframework.bian.currentaccount.dto.bq.Payments payments) {
        this.payments = payments;
    }

    public org.museframework.bian.currentaccount.dto.bq.Payments getPayments() {
        return payments;
    }
}