/*The sub-tasks involved in the execution of the financial transaction*/
package org.museframework.bian.marordexe.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.Quote
@MetaDto
public class Quote {
    /*The security for which the quote is provided*/
    @MetaField(0)
    private String quoteSecurityType;

    /*The type of quote being provided (e.g. current market, bank committed)*/
    @MetaField(0)
    private String quoteType;

    /*The buy/sell quote by trade type and volume as appropriate*/
    @MetaField(0)
    private String quote;

    public void setQuoteSecurityType(String quoteSecurityType) {
        this.quoteSecurityType = quoteSecurityType;
    }

    public String getQuoteSecurityType() {
        return quoteSecurityType;
    }

    public void setQuoteType(String quoteType) {
        this.quoteType = quoteType;
    }

    public String getQuoteType() {
        return quoteType;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getQuote() {
        return quote;
    }
}