package org.museframework.bian.consumerinvestments.dto;

public class RetrieveQuoteResponse {
    private org.museframework.bian.consumerinvestments.dto.bq.Quote quote;

    public void setQuote(org.museframework.bian.consumerinvestments.dto.bq.Quote quote) {
        this.quote = quote;
    }

    public org.museframework.bian.consumerinvestments.dto.bq.Quote getQuote() {
        return quote;
    }
}