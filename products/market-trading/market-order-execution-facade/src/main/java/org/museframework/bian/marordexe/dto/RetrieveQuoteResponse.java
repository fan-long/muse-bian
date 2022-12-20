package org.museframework.bian.marordexe.dto;

public class RetrieveQuoteResponse {
    private org.museframework.bian.marordexe.dto.bq.Quote quote;

    public void setQuote(org.museframework.bian.marordexe.dto.bq.Quote quote) {
        this.quote = quote;
    }

    public org.museframework.bian.marordexe.dto.bq.Quote getQuote() {
        return quote;
    }
}