package org.museframework.bian.customerbilling.dto;

public class RetrieveInvoicingRequest {
    private String customerbillingid;

    private String invoicingid;

    public void setCustomerbillingid(String customerbillingid) {
        this.customerbillingid = customerbillingid;
    }

    public String getCustomerbillingid() {
        return customerbillingid;
    }

    public void setInvoicingid(String invoicingid) {
        this.invoicingid = invoicingid;
    }

    public String getInvoicingid() {
        return invoicingid;
    }
}