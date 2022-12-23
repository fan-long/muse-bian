package org.museframework.bian.marordexe.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateQuoteRequest {
    @MetaField
    private String marketorderexecutionid;

    @MetaField
    private String quoteid;

    @MetaField(ref=true)
    private org.museframework.bian.marordexe.dto.bq.Quote quote;

    public void setMarketorderexecutionid(String marketorderexecutionid) {
        this.marketorderexecutionid = marketorderexecutionid;
    }

    public String getMarketorderexecutionid() {
        return marketorderexecutionid;
    }

    public void setQuoteid(String quoteid) {
        this.quoteid = quoteid;
    }

    public String getQuoteid() {
        return quoteid;
    }

    public void setQuote(org.museframework.bian.marordexe.dto.bq.Quote quote) {
        this.quote = quote;
    }

    public org.museframework.bian.marordexe.dto.bq.Quote getQuote() {
        return quote;
    }
}