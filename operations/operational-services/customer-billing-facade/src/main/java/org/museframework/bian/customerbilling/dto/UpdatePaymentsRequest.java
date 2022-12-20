package org.museframework.bian.customerbilling.dto;

public class UpdatePaymentsRequest {
    private String customerbillingid;

    private String paymentsid;

    private org.museframework.bian.customerbilling.dto.bq.Payments payments;

    public void setCustomerbillingid(String customerbillingid) {
        this.customerbillingid = customerbillingid;
    }

    public String getCustomerbillingid() {
        return customerbillingid;
    }

    public void setPaymentsid(String paymentsid) {
        this.paymentsid = paymentsid;
    }

    public String getPaymentsid() {
        return paymentsid;
    }

    public void setPayments(org.museframework.bian.customerbilling.dto.bq.Payments payments) {
        this.payments = payments;
    }

    public org.museframework.bian.customerbilling.dto.bq.Payments getPayments() {
        return payments;
    }
}