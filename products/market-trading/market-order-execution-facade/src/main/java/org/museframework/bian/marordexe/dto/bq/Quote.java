/*The sub-tasks involved in the execution of the financial transaction*/
package org.museframework.bian.marordexe.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Quote extends org.museframework.bian.classes.Quote {
    /*The security for which the quote is provided*/
    @MetaField
    private String quoteSecurityType;

    /*The type of quote being provided (e.g. current market, bank committed)*/
    @MetaField
    private String quoteType;

    /*The buy/sell quote by trade type and volume as appropriate*/
    @MetaField
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