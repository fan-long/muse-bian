package org.museframework.bian.marordexe.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveQuoteResponse {
    @MetaField(ref=true)
    private org.museframework.bian.marordexe.dto.bq.Quote quote;

    public void setQuote(org.museframework.bian.marordexe.dto.bq.Quote quote) {
        this.quote = quote;
    }

    public org.museframework.bian.marordexe.dto.bq.Quote getQuote() {
        return quote;
    }
}