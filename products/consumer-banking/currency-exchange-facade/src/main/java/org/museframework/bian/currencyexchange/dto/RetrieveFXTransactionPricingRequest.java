package org.museframework.bian.currencyexchange.dto;

public class RetrieveFXTransactionPricingRequest {
    private String currencyexchangeid;

    private String fxtransactionpricingid;

    public void setCurrencyexchangeid(String currencyexchangeid) {
        this.currencyexchangeid = currencyexchangeid;
    }

    public String getCurrencyexchangeid() {
        return currencyexchangeid;
    }

    public void setFxtransactionpricingid(String fxtransactionpricingid) {
        this.fxtransactionpricingid = fxtransactionpricingid;
    }

    public String getFxtransactionpricingid() {
        return fxtransactionpricingid;
    }
}