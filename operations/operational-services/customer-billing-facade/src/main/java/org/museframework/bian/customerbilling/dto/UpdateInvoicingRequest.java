package org.museframework.bian.customerbilling.dto;

public class UpdateInvoicingRequest {
    private String customerbillingid;

    private String invoicingid;

    private org.museframework.bian.customerbilling.dto.bq.Invoicing invoicing;

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

    public void setInvoicing(org.museframework.bian.customerbilling.dto.bq.Invoicing invoicing) {
        this.invoicing = invoicing;
    }

    public org.museframework.bian.customerbilling.dto.bq.Invoicing getInvoicing() {
        return invoicing;
    }
}