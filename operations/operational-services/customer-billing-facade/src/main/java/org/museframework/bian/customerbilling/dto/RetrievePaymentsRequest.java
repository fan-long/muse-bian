package org.museframework.bian.customerbilling.dto;

public class RetrievePaymentsRequest {
    private String customerbillingid;

    private String paymentsid;

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
}