/*A quote is the last price at which an asset traded; it is the most recent price that a buyer and seller agreed upon and at which some amount of the asset was transacted.
https://www.investopedia.com/terms/q/quote.asp

Indicates whether the quote details are indicated as an offer, a bid or a mid of a security, commodity, currency (the latter being an average of the offer and the bid).
https://www.iso20022.org/standardsrepository/type/Quote*/
package org.museframework.bian.classes;

public class Quote {
    /**/
    private org.museframework.bian.enumerations.Pricetypevalues priceType;

    /*Exchange rate specified in a quote. (ISO20022)*/
    private String quotedRate;

    /*Provide the status for the quote.*/
    private org.museframework.bian.enumerations.Quotestatusvalue quoteStatus;

    public void setPriceType(org.museframework.bian.enumerations.Pricetypevalues priceType) {
        this.priceType = priceType;
    }

    public org.museframework.bian.enumerations.Pricetypevalues getPriceType() {
        return priceType;
    }

    public void setQuotedRate(String quotedRate) {
        this.quotedRate = quotedRate;
    }

    public String getQuotedRate() {
        return quotedRate;
    }

    public void setQuoteStatus(org.museframework.bian.enumerations.Quotestatusvalue quoteStatus) {
        this.quoteStatus = quoteStatus;
    }

    public org.museframework.bian.enumerations.Quotestatusvalue getQuoteStatus() {
        return quoteStatus;
    }
}