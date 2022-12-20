package org.museframework.bian.customerbilling.dto;

public class RetrieveInvoicingResponse {
    private org.museframework.bian.customerbilling.dto.bq.Invoicing invoicing;

    public void setInvoicing(org.museframework.bian.customerbilling.dto.bq.Invoicing invoicing) {
        this.invoicing = invoicing;
    }

    public org.museframework.bian.customerbilling.dto.bq.Invoicing getInvoicing() {
        return invoicing;
    }
}