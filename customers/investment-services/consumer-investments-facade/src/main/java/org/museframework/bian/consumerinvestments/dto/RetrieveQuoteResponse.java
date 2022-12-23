package org.museframework.bian.consumerinvestments.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveQuoteResponse {
    @MetaField(ref=true)
    private org.museframework.bian.consumerinvestments.dto.bq.Quote quote;

    public void setQuote(org.museframework.bian.consumerinvestments.dto.bq.Quote quote) {
        this.quote = quote;
    }

    public org.museframework.bian.consumerinvestments.dto.bq.Quote getQuote() {
        return quote;
    }
}