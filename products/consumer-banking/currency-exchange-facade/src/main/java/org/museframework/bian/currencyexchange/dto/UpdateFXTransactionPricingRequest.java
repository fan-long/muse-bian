package org.museframework.bian.currencyexchange.dto;

public class UpdateFXTransactionPricingRequest {
    private String currencyexchangeid;

    private String fxtransactionpricingid;

    private org.museframework.bian.currencyexchange.dto.bq.FXTransactionPricing fXTransactionPricing;

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

    public void setfXTransactionPricing(org.museframework.bian.currencyexchange.dto.bq.FXTransactionPricing fXTransactionPricing) {
        this.fXTransactionPricing = fXTransactionPricing;
    }

    public org.museframework.bian.currencyexchange.dto.bq.FXTransactionPricing getfXTransactionPricing() {
        return fXTransactionPricing;
    }
}