package org.museframework.bian.quotemanagement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteQuotationProcedureRequest {
    @MetaField
    private String quotemanagementid;

    @MetaField(ref=true)
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