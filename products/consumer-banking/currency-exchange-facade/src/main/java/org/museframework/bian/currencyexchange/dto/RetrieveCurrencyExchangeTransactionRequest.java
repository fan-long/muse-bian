package org.museframework.bian.currencyexchange.dto;

public class RetrieveCurrencyExchangeTransactionRequest {
    private String currencyexchangeid;

    public void setCurrencyexchangeid(String currencyexchangeid) {
        this.currencyexchangeid = currencyexchangeid;
    }

    public String getCurrencyexchangeid() {
        return currencyexchangeid;
    }
}