package org.museframework.bian.currencyexchange.dto;

public class RequestCurrencyExchangeTransactionRequest {
    private String currencyexchangeid;

    private org.museframework.bian.currencyexchange.dto.cr.CurrencyExchangeTransaction currencyExchangeTransaction;

    public void setCurrencyexchangeid(String currencyexchangeid) {
        this.currencyexchangeid = currencyexchangeid;
    }

    public String getCurrencyexchangeid() {
        return currencyexchangeid;
    }

    public void setCurrencyExchangeTransaction(org.museframework.bian.currencyexchange.dto.cr.CurrencyExchangeTransaction currencyExchangeTransaction) {
        this.currencyExchangeTransaction = currencyExchangeTransaction;
    }

    public org.museframework.bian.currencyexchange.dto.cr.CurrencyExchangeTransaction getCurrencyExchangeTransaction() {
        return currencyExchangeTransaction;
    }
}