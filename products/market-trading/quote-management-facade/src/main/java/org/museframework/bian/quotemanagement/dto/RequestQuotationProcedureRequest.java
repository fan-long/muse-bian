package org.museframework.bian.quotemanagement.dto;

public class RequestQuotationProcedureRequest {
    private String quotemanagementid;

    private org.museframework.bian.quotemanagement.dto.cr.QuotationProcedure quotationProcedure;

    public void setQuotemanagementid(String quotemanagementid) {
        this.quotemanagementid = quotemanagementid;
    }

    public String getQuotemanagementid() {
        return quotemanagementid;
    }

    public void setQuotationProcedure(org.museframework.bian.quotemanagement.dto.cr.QuotationProcedure quotationProcedure) {
        this.quotationProcedure = quotationProcedure;
    }

    public org.museframework.bian.quotemanagement.dto.cr.QuotationProcedure getQuotationProcedure() {
        return quotationProcedure;
    }
}