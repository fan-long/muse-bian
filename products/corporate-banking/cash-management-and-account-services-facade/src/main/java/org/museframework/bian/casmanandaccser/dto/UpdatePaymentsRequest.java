package org.museframework.bian.casmanandaccser.dto;

public class UpdatePaymentsRequest {
    private String cashmanagementandaccountservicesid;

    private String paymentsid;

    private org.museframework.bian.casmanandaccser.dto.bq.Payments payments;

    public void setCashmanagementandaccountservicesid(String cashmanagementandaccountservicesid) {
        this.cashmanagementandaccountservicesid = cashmanagementandaccountservicesid;
    }

    public String getCashmanagementandaccountservicesid() {
        return cashmanagementandaccountservicesid;
    }

    public void setPaymentsid(String paymentsid) {
        this.paymentsid = paymentsid;
    }

    public String getPaymentsid() {
        return paymentsid;
    }

    public void setPayments(org.museframework.bian.casmanandaccser.dto.bq.Payments payments) {
        this.payments = payments;
    }

    public org.museframework.bian.casmanandaccser.dto.bq.Payments getPayments() {
        return payments;
    }
}