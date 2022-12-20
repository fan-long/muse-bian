package org.museframework.bian.quotemanagement.dto;

public class InitiateQuotationProcedureRequest {
    private org.museframework.bian.quotemanagement.dto.cr.QuotationProcedure quotationProcedure;

    public void setQuotationProcedure(org.museframework.bian.quotemanagement.dto.cr.QuotationProcedure quotationProcedure) {
        this.quotationProcedure = quotationProcedure;
    }

    public org.museframework.bian.quotemanagement.dto.cr.QuotationProcedure getQuotationProcedure() {
        return quotationProcedure;
    }
}